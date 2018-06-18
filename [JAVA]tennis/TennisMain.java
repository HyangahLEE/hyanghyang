package tennis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TennisMain {

	public static void main(String[] args) {
		SelectedGame sg= new SelectedGame();
		sg.dispMenus();
		sg.selectedGender();
		sg.setNum(GameValues.s_gender);
		sg.getName();
		GetScore gs = new GetScore();
		gs.getServe();
		//gs.pointWinner(GetScore.p);

		//시간출력
		long curr = System.currentTimeMillis();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datatime = sdf.format(new Date(curr));
		//System.out.println(">> "+ datatime);

		File file1 = new File("C:/Temp/file.txt");
		try ( FileWriter   fw = new FileWriter(file1, true);){
			
			fw.write("선수 이름 : " + sg.playerName1 + ":" + sg.playerName2 + "/" + gs.t1Set + ":" + gs.t2Set +"/"+datatime +"\r\n");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}



	}





}


