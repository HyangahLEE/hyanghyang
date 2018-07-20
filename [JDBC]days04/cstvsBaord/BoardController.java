package days04.cstvsBaord;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.util.DBConn;

import days03.emp.empDTO;



public class BoardController {


	static Scanner sc = null;
	private BoardService service = null;

	public BoardController(BoardService service) {
		super();

		this.service = service;
		this.sc = new Scanner(System.in);
	}

	public void start() {
		while (true) {
			printMenus();
			selectMenus();
			processMenus();
		}
		//�޴����
		//�޴�����
		//���õ� �޴�ó��.



	}
	//http://www.naver.com/board/writer.html
	//Ex06.java main(){} �޴����� > �۾��� > ~~

	private void processMenus() {

		switch (this.s_num) {
		case 1: //����
			inputNewArticle();
			break;
		case 2: //����
			SelectArticle();
			break;
		case 3: //����
			viewArticle();
			break;
		case 4: //����
			UpdateArticle();
			break;
		case 5: //����
			deleteArticle();
			break;
		case 6: //����
			searchArticle();
			break;
		case 7:
			DBConn.close();
			System.out.println("\n\n");
			System.out.println("> �����մϴ�.");
			System.exit(-1);
			break;
		default:
			break;
		}

	}

	private void searchArticle() {
		System.out.print("> �˻� ����, �˻��� �Է�? ");
		String searchCondition = sc.next();
		String searchWord = sc.next();

		List<BoardDTO> list = service.searchArticleService(searchCondition, searchWord, 1, pageSize); // 1 = currentpage�� �� �Ѵ�.

		System.out.println("\n\t\t\t\t\t �Խ���");
		System.out.println("\t---------------------------------------------------------------------------");
		System.out.printf("\t%s\t\t%s\t\t\t%s\t\t\t%s\t\t%s\n", "�۹�ȣ", "������", "�۾���", "�ۼ���", "��ȸ��");
		System.out.println("\t---------------------------------------------------------------------------");
		Iterator<BoardDTO> ir = list.iterator();
		while (ir.hasNext()) {
			BoardDTO dto = ir.next();
			System.out.printf("\t%s\t%s\t\t%s\t%s\t\t%s\n", dto.getSeq(), dto.getTitle(), dto.getWriter(),
					dto.getWriteDate(), dto.getReaded());
		}
		System.out.println("\t---------------------------------------------------------------------------");

		String strPageBlock = this.service.pageBlockService(this.currentPage, this.pageSize, this.pageBlock, searchCondition, searchWord);
		System.out.printf("\t%s\n", strPageBlock);
		
		System.out.println("\t---------------------------------------------------------------------------");
		System.out.println("> ����Ϸ��� ���� ġ����.....");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	/*BoardDTO dto = null;
		String searchWord= null;
		System.out.println("�˻� ���� ����");
		System.out.println("1.���� �˻�");
		System.out.println("2.�۾��� �˻�");
		System.out.println("3. ����+���� �˻�");		

		int searchCondition = sc.nextInt();

			switch (searchCondition) {
			case 1:
				System.out.println("������ �Է��ϼ���.");
				searchWord=  this.sc.next();
				ArrayList<BoardDTO> list = this.service.searchArticle(searchCondition, searchWord);
				break;
			case 2:
				System.out.println("�۾����� �Է��ϼ���.");
				searchWord = this.sc.next();
				ArrayList<BoardDTO> list=this.service.searchArticle(searchCondition,searchWord);
				break;
			case 3:
				System.out.println("����Ǵ� ������ �Է��ϼ���.");
				searchWord = this.sc.next();
				ArrayList<BoardDTO> list=this.service.searchArticle(searchCondition,searchWord);
				break;
			default:
				break;
			}

			if(list ==null) {

				System.out.println("����� �����ϴ�!!");
				return;
			}
			list = new ArrayList();
			Iterator<empDTO> ir = list.iterator();
			while (ir.hasNext()) {
				BoardDTO dto =  ir.next();
				System.out.printf("%s %s %s %s\n",dto.getTitle(),dto.getEmail(),dto.getWriter(),dto.getContent());
			}

	 */



	private void deleteArticle() {
		BoardDTO dto  = null;
		System.out.println("� �Խñ� ����?");
		int seq = this.sc.nextInt();
		System.out.println("���� �����Ͻðڽ��ϱ�? (y/n)");
		char y = this.sc.next().charAt(0);
		if(y =='y') {
			int cnt = this.service.deleteArticleService(seq);
			if(cnt==1)  System.out.println("���� �Ϸ�"); 

		}else if(y=='n'){
			System.out.println("----------------------------------------");
			System.out.println("> �޴��� ���ư����� ����ġ����");      
			try {
				System.in.read();
				System.in.skip(System.in.available());
			} catch (Exception e) {
				e.printStackTrace();
			}


		}


	}


	private void viewArticle() {
		BoardDTO dto = null;
		System.out.println("> � �Խñ� seq �Է� ? ");
		int seq= this.sc.nextInt();
		dto = new BoardDTO();
		dto= this.service.viewArticleService(seq);

		if(dto == null) {

			System.out.println("> �������� �ʴ� �Խñ� �Դϴ�.");
		}
		System.out.println();
		System.out.printf("> �� ��ȣ : %d\n",dto.getSeq());
		System.out.printf("> �ۼ� �� : %tF\n",dto.getWriteDate());
		System.out.printf("> ��ȸ�� : %d\n",dto.getReaded());
		System.out.printf("> �ۼ��� : %s\n",dto.getWriter());
		System.out.printf("> �� ���� : %s\n",dto.getTitle());
		System.out.printf("> �� ���� : %s\n",dto.getContent());

		System.out.println("\t----------------------------------------");
		System.out.println("> ����Ϸ��� ����ġ����");      
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

	private void UpdateArticle() {
		BoardDTO dto = null;
		System.out.println("������ �۹�ȣ ?");
		int seq = this.sc.nextInt();
		//������ �ۺ����ֱ�
		dto = new BoardDTO();
		dto= this.service.viewArticleService(seq);

		if(dto == null) {

			System.out.println("> �������� �ʴ� �Խñ� �Դϴ�.");
		}
		System.out.println();
		System.out.printf("> �� ��ȣ : %d\n",dto.getSeq());
		System.out.printf("> �ۼ� �� : %tF\n",dto.getWriteDate());
		System.out.printf("> ��ȸ�� : %d\n",dto.getReaded());
		System.out.printf("> �ۼ��� : %s\n",dto.getWriter());
		System.out.printf("> �� ���� : %s\n",dto.getTitle());
		System.out.printf("> �� ���� : %s\n",dto.getContent());
		System.out.println();
		//������ �� �Է�
		dto.setSeq(seq);
		System.out.println(">  ������ ���� �Է� ?");
		String title = this.sc.next();
		dto.setTitle(title);
		System.out.println(">  ������ �̸��� �Է� ?");
		String email = this.sc.next();
		dto.setEmail(email);
		System.out.println(">  ������ ���� �Է� ?");
		String content = this.sc.next();
		dto.setContent(content);

		//

		int cnt = this.service.updateService(dto);
		if(cnt == 1) {System.out.println("�����Ϸ�");}

		System.out.println("\t----------------------------------------");
		System.out.println("> ����Ϸ��� ����ġ����");      
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (Exception e) {
			e.printStackTrace();
		}
		//

	}


	private int currentPage =1;
	private int pageSize = 15;
	private int pageBlock = 10;

	private void SelectArticle() {
		System.out.println("> ������ �ѹ��� �Է��ϼ���? ");
		this.currentPage = this.sc.nextInt();
		List<BoardDTO> list = this.service.selectService(currentPage, pageSize);
		System.out.println("\n\t\t�Խ���");
		System.out.println("\t----------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n","�۹�ȣ","������","�۾���","�ۼ���","��ȸ��");
		System.out.println("\t----------------------------------------");
		Iterator<BoardDTO>ir = list.iterator();
		while (ir.hasNext()) {
			BoardDTO dto = (BoardDTO) ir.next();
			System.out.printf("%d\t%s\t%s\t%s\t%s\n",dto.getSeq(),dto.getTitle()
					,dto.getWriter(),dto.getWriteDate(),dto.getReaded());
		}
		System.out.println("\t----------------------------------------");
		String strPageBlock = this.service.pageBlockService(this.currentPage,this.pageSize ,this.pageBlock, "writer","");
		System.out.printf("\t%s\n",strPageBlock);

		System.out.println("\t----------------------------------------");
		System.out.println("> ����Ϸ��� ����ġ����");      
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void inputNewArticle() {

		BoardDTO dto = null;
		// �ܼ� â���� �Է�...
		/*
		 insert into cstvboard ( seq,writer,pwd,email,title,ismode,content ) 
		 values (seq_cstvsboard.nextval,?,?,?,?,?,? );
		 * */
		System.out.println("> writer, pwd, email, title, ismode, content input?");

		String writer = this.sc.next();
		String pwd = this.sc.next();
		String email = this.sc.next();
		String title = this.sc.next();
		char ismode= this.sc.next().charAt(0);
		String content = this.sc.next();

		dto = new BoardDTO(ismode, content,email, writer, pwd, title);
		int cnt =this.service.insertService(dto);// �Է¹��� ���� dto�� �ѱ��
		if(cnt ==1) {

			System.out.println("> �� �� ���� �ϼ�");
		}
	}

	private int s_num;
	private void selectMenus() {

		System.out.println(" > �޴� ���� <");
		this.s_num = sc.nextInt();
	}

	private void printMenus() {
		String[] menus = {
				"����", "���","�ۺ���","����","����","�˻�","����"
		};
		System.out.println(" [ �޴� ] ");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\t", i+1, menus[i]);
		}
		System.out.println();

	}

}
