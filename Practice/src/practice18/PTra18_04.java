/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		
		//各ポジションのArrayListを作成
		ArrayList<entityPlayer> gk = new ArrayList<>();
		ArrayList<entityPlayer> df = new ArrayList<>();
		ArrayList<entityPlayer> mf = new ArrayList<>();
		ArrayList<entityPlayer> fw = new ArrayList<>();

        try{
        	Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"));
        	for (int i=0; scanner.hasNext(); i++) {
                String line = scanner.nextLine();
                String[] info = line.split(",",0);

                entityPlayer player= new entityPlayer();
                player.setPosition(info[0]);
                player.setName(info[1]);
                player.setCountry(info[2]);
                player.setTeam(info[3]);

                // ★ 1行ごとにArrayListに格納してください
                switch(player.getPosition()){
                case "GK":
                	gk.add(player);
                	break;
                case "DF":
                	df.add(player);
                	break;
                case "MF":
                	mf.add(player);
                	break;
                case "FW":
                	fw.add(player);
                	break;
                default:
                	System.out.println(player.getName() + "(" + player.getPosition() +  ")"  + "は該当のポジションがありませんでした。");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
        
        //全ポジションのArrayListをシャッフル
        Collections.shuffle(gk);
        Collections.shuffle(df);
        Collections.shuffle(mf);
        Collections.shuffle(fw);
        
        //各ポジションの選出数を決定  {GK,DF,MF,FW}
        int[] collectNm = {1,4,4,2};
        
        //各ポジションを選出人数分だけ出力する
        for(int i=0; i<collectNm.length; i++) {
        	switch(i) {
        	case 0:
        		for(int j=0; j<collectNm[i]; j++) {
        			System.out.println(gk.get(j).toString());
        		}
        		break;
        	case 1:
        		for(int j=0; j<collectNm[i]; j++) {
        			System.out.println(df.get(j).toString());
        		}
        		break;
        	case 2:
        		for(int j=0; j<collectNm[i]; j++) {
        			System.out.println(mf.get(j).toString());
        		}
        		break;
        	case 3:
        		for(int j=0; j<collectNm[i]; j++) {
        			System.out.println(fw.get(j).toString());
        		}
        		break;
        	}
        }

	}
}
