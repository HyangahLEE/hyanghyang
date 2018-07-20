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
		//메뉴출력
		//메뉴션택
		//선택된 메뉴처리.



	}
	//http://www.naver.com/board/writer.html
	//Ex06.java main(){} 메뉴선택 > 글쓰기 > ~~

	private void processMenus() {

		switch (this.s_num) {
		case 1: //새글
			inputNewArticle();
			break;
		case 2: //새글
			SelectArticle();
			break;
		case 3: //보기
			viewArticle();
			break;
		case 4: //수정
			UpdateArticle();
			break;
		case 5: //수정
			deleteArticle();
			break;
		case 6: //수정
			searchArticle();
			break;
		case 7:
			DBConn.close();
			System.out.println("\n\n");
			System.out.println("> 종료합니다.");
			System.exit(-1);
			break;
		default:
			break;
		}

	}

	private void searchArticle() {
		System.out.print("> 검색 조건, 검색어 입력? ");
		String searchCondition = sc.next();
		String searchWord = sc.next();

		List<BoardDTO> list = service.searchArticleService(searchCondition, searchWord, 1, pageSize); // 1 = currentpage를 뜻 한다.

		System.out.println("\n\t\t\t\t\t 게시판");
		System.out.println("\t---------------------------------------------------------------------------");
		System.out.printf("\t%s\t\t%s\t\t\t%s\t\t\t%s\t\t%s\n", "글번호", "글제목", "글쓴이", "작성일", "조회수");
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
		System.out.println("> 계속하려면 엔터 치세요.....");
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

	/*BoardDTO dto = null;
		String searchWord= null;
		System.out.println("검색 조건 선택");
		System.out.println("1.제목 검색");
		System.out.println("2.글쓴이 검색");
		System.out.println("3. 제목+내용 검색");		

		int searchCondition = sc.nextInt();

			switch (searchCondition) {
			case 1:
				System.out.println("제목을 입력하세요.");
				searchWord=  this.sc.next();
				ArrayList<BoardDTO> list = this.service.searchArticle(searchCondition, searchWord);
				break;
			case 2:
				System.out.println("글쓴이을 입력하세요.");
				searchWord = this.sc.next();
				ArrayList<BoardDTO> list=this.service.searchArticle(searchCondition,searchWord);
				break;
			case 3:
				System.out.println("제목또는 내용을 입력하세요.");
				searchWord = this.sc.next();
				ArrayList<BoardDTO> list=this.service.searchArticle(searchCondition,searchWord);
				break;
			default:
				break;
			}

			if(list ==null) {

				System.out.println("사원이 없습니다!!");
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
		System.out.println("어떤 게시글 삭제?");
		int seq = this.sc.nextInt();
		System.out.println("정말 삭제하시겠습니까? (y/n)");
		char y = this.sc.next().charAt(0);
		if(y =='y') {
			int cnt = this.service.deleteArticleService(seq);
			if(cnt==1)  System.out.println("삭제 완료"); 

		}else if(y=='n'){
			System.out.println("----------------------------------------");
			System.out.println("> 메뉴로 돌아가려면 엔터치세요");      
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
		System.out.println("> 어떤 게시글 seq 입력 ? ");
		int seq= this.sc.nextInt();
		dto = new BoardDTO();
		dto= this.service.viewArticleService(seq);

		if(dto == null) {

			System.out.println("> 존재하지 않는 게시글 입니다.");
		}
		System.out.println();
		System.out.printf("> 글 번호 : %d\n",dto.getSeq());
		System.out.printf("> 작성 일 : %tF\n",dto.getWriteDate());
		System.out.printf("> 조회수 : %d\n",dto.getReaded());
		System.out.printf("> 작성자 : %s\n",dto.getWriter());
		System.out.printf("> 글 제목 : %s\n",dto.getTitle());
		System.out.printf("> 글 내용 : %s\n",dto.getContent());

		System.out.println("\t----------------------------------------");
		System.out.println("> 계속하려면 엔터치세요");      
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (Exception e) {
			e.printStackTrace();
		}



	}

	private void UpdateArticle() {
		BoardDTO dto = null;
		System.out.println("수정할 글번호 ?");
		int seq = this.sc.nextInt();
		//수정할 글보여주기
		dto = new BoardDTO();
		dto= this.service.viewArticleService(seq);

		if(dto == null) {

			System.out.println("> 존재하지 않는 게시글 입니다.");
		}
		System.out.println();
		System.out.printf("> 글 번호 : %d\n",dto.getSeq());
		System.out.printf("> 작성 일 : %tF\n",dto.getWriteDate());
		System.out.printf("> 조회수 : %d\n",dto.getReaded());
		System.out.printf("> 작성자 : %s\n",dto.getWriter());
		System.out.printf("> 글 제목 : %s\n",dto.getTitle());
		System.out.printf("> 글 내용 : %s\n",dto.getContent());
		System.out.println();
		//수정할 값 입력
		dto.setSeq(seq);
		System.out.println(">  수정할 제목 입력 ?");
		String title = this.sc.next();
		dto.setTitle(title);
		System.out.println(">  수정할 이메일 입력 ?");
		String email = this.sc.next();
		dto.setEmail(email);
		System.out.println(">  수정할 내용 입력 ?");
		String content = this.sc.next();
		dto.setContent(content);

		//

		int cnt = this.service.updateService(dto);
		if(cnt == 1) {System.out.println("수정완료");}

		System.out.println("\t----------------------------------------");
		System.out.println("> 계속하려면 엔터치세요");      
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
		System.out.println("> 페이지 넘버를 입력하세요? ");
		this.currentPage = this.sc.nextInt();
		List<BoardDTO> list = this.service.selectService(currentPage, pageSize);
		System.out.println("\n\t\t게시판");
		System.out.println("\t----------------------------------------");
		System.out.printf("%s\t%s\t%s\t%s\t%s\n","글번호","글제목","글쓴이","작성일","조회수");
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
		System.out.println("> 계속하려면 엔터치세요");      
		try {
			System.in.read();
			System.in.skip(System.in.available());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void inputNewArticle() {

		BoardDTO dto = null;
		// 콘솔 창에서 입력...
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
		int cnt =this.service.insertService(dto);// 입력받은 값을 dto에 넘긴다
		if(cnt ==1) {

			System.out.println("> 새 글 쓰기 완성");
		}
	}

	private int s_num;
	private void selectMenus() {

		System.out.println(" > 메뉴 선택 <");
		this.s_num = sc.nextInt();
	}

	private void printMenus() {
		String[] menus = {
				"새글", "목록","글보기","수정","삭제","검색","종료"
		};
		System.out.println(" [ 메뉴 ] ");
		for (int i = 0; i < menus.length; i++) {
			System.out.printf("%d. %s\t", i+1, menus[i]);
		}
		System.out.println();

	}

}
