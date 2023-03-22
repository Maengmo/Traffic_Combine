package com.test.Train;

public class Train_UI {

	public static void list() {
		
		String list = String.format(
				"╔〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓╗\n"
			  + "      1.  ITX\n"
			  + "      2.  KTX\n"
			  + "      3.  무궁화호\n"
			  + "╚〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓╝\n");
		banner();
		System.out.println(list);
		
	}
	public static void banner() {
		System.out.println("▣▣▣▣[열 차 종 류 선 택]▣▣▣▣");
	}
	
	public static void ktx_list() {
		
		String list = String.format(
				"╔〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓╗\n"
			  + "      1.  강릉선\n"
			  + "      2.  경부고속선\n"
			  + "      3.  경전선\n"
			  + "      4.  전라선\n"
			  + "      5.  중북내륙선\n"
			  + "      6.  중앙선\n"
			  + "      7.  호남선\n"
			  + "╚〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓╝\n");
		
		System.out.println(list);
		
	}
	
	public static void mkh_list() {
		
		String list = String.format(
				"╔〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓╗\n"
			  + "      1.  무궁화호_경부선\n"
			  + "      2.  무궁화호_경북선\n"
			  + "      3.  무궁화호_경전선\n"
			  + "      4.  무궁화호_대구선\n"
			  + "      5.  무궁화호_동해남부선\n"
			  + "      6.  무궁화호_동해선\n"
			  + "      7.  무궁화호_영동선\n"
			  + "      8.  무궁화호_장항선\n"
			  + "      9.  무궁화호_전라선\n"
			  + "      10. 무궁화호_중앙선\n"
			  + "      11. 무궁화호_충북선\n"
			  + "      12. 무궁화호_태백선\n"
			  + "      13. 무궁화호_호남선\n"
			  + "╚〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓〓╝\n");
		
		System.out.println(list);
	}
}
