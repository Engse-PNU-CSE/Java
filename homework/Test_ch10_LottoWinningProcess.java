package com.ruby.java.homework;
//구현과제로 실습
//실습 과제에서 더 나아가서 실제 로또 추첨지를 만들었습니다. 일부 주석을 해제하시면 실습소스코드가 됩니다.
//hashset을 arraylist로 변환하여 정렬하기 구현

import java.text.DecimalFormat;
/*
 * 로또 당첨 규칙:
 * 꽝: 번호 2개, 1개
 * 5등: 번호 3개 - 5000원
 * 4등: 번호 4개 - 5만원
 * 3등: 번호 5개 - 150만원 - 판매금액에 변동(판매금액의 12.5%)
 * 2등: 3등번호 + 보너스번호 - 3000만원 - 판매 금액에 변동, 당첨 확률: 1,300,000분의1
 * 1등: 6개 숫자 - 당첨 확률 8,000,000 분의 1, 10억 ~ 30억
 */
//hashset을 arraylist로 변환하여 정렬하기 구현
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

//class ListComparator implements Comparator<List<Integer>> {
//	@Override
//	public int compare(List<Integer> l1, List<Integer> l2) {
//		Iterator<Integer> ait = l1.iterator();
//		Iterator<Integer> bit = l2.iterator();
//		while (ait.hasNext()) {
//			int anum = ait.next();
//			int bnum = bit.next();
//			if (anum > bnum)
//				return 1;
//			else if (anum < bnum)
//				return -1;
//		}
//		return 0;
//	}
//}

public class Test_ch10_LottoWinningProcess {

	public static void main(String[] args) {
//		lotto_generator(10);
		lotto_generator(salesLotto());

	}

	static int salesLotto() {

		Random number = new Random();
		int count = 3000000 + number.nextInt(100000);
		return count;
	}
	
	public static void lottoyPrize(int[] wincount, int count) {
		DecimalFormat dc = new DecimalFormat("###,###,###,###,###");
		long totalSales = (long)count * 1000;
		long totalPrize = totalSales / 2;
		System.out.println("총 판매금액 : " + dc.format(totalSales) + " 원");
		System.out.println("총 상금 : " + dc.format(totalPrize) + " 원");
		for(int i=1; i < 6; i++) System.out.println(i + "등 당첨자 수 : " + wincount[i]);
		int prize5 = 5000*wincount[5];
		int prize4 = 50000*wincount[4];
		long prize3 = (totalPrize - prize5 - prize4)/8;
		long prize2 = prize3;
		long prize1 = 6 * prize3;
		System.out.println("=============================");
		System.out.println("1등 총 당첨 금액 : " + dc.format(prize1) + " 원");
		if(wincount[1] == 0) System.out.println("당첨자가 없습니다.");
		else System.out.println("1인당 당첨 금액 : " + dc.format(prize1/wincount[1]));
		System.out.println("2등 총 당첨 금액 : " + dc.format(prize2) + " 원");
		if(wincount[2] == 0) System.out.println("당첨자가 없습니다.");
		else System.out.println("1인당 당첨 금액 : " + dc.format(prize2/wincount[2]));
		System.out.println("3등 총 당첨 금액 : " + dc.format(prize3) + " 원");
		if(wincount[3] == 0) System.out.println("당첨자가 없습니다.");
		else System.out.println("1인당 당첨 금액 : " + dc.format(prize3/wincount[3]));
		System.out.println("4등 총 당첨 금액 : " + dc.format(prize4) + " 원");
		System.out.println("당첨 금액 : 50,000 원");
		System.out.println("5등 총 당첨 금액 : " + dc.format(prize5) + " 원");
		System.out.println("당첨 금액 : 5,000 원");
		System.out.println("=============================");
	}
	
	public static void lotto_generator(int n) {
		Random number = new Random();
		HashSet<HashSet<Integer>> lot = new HashSet<>();
		HashSet<Integer> lotto = null;
		List<List<Integer>> al = new ArrayList<>();
		/*
		 * [[35, 40, 27, 29, 14, 31, 15], [0, 1, 18, 38, 6, 24, 29], [16, 32, 0, 18, 34,
		 * 22, 14], [32, 34, 40, 9, 12, 28, 14], [0, 19, 6, 9, 42, 29, 13], [2, 3, 37,
		 * 43, 44, 29, 14], [33, 1, 17, 22, 6, 8, 12], [34, 21, 9, 10, 27, 44, 45], [18,
		 * 34, 23, 9, 28, 29, 15], [32, 6, 23, 24, 10, 27, 43]]
		 */
		for (int i = 0; i < n; i++) {

			lotto = new HashSet<>();
			// 구현할 부분
			while(lotto.size() <= 6) lotto.add(number.nextInt(45)+1);
			lot.add(lotto);

		}
	//	System.out.println("\nlot hashset을 출력\n");
		for (HashSet<Integer> eachLotto : lot) {
			/*
			 * 33 1 17 22 6 8 + 보너스번호: 12 0 1 18 38 6 24 + 보너스번호: 29
			 */
			// 구현할 부분
			List<Integer> LL = new ArrayList<Integer>(eachLotto);
			al.add(LL);
			//System.out.print("\n복권 번호 : ");
			//for(int i = 0; i < LL.size()-1; i++) System.out.print(LL.get(i) + " ");
			
		}
		//System.out.println("\n복권 정렬전::lot = " + al);
//
//		al.sort(new ListComparator());
//		System.out.println("복권 정렬후::lot = " + al);
//		// hashset의 리스트를 정렬하는 알고리즘 개발
//		// hashset를 arrayList로 변환
//		// 당첨번호 추첨
		HashSet<Integer> win = new HashSet<>();
		while(win.size() < 6) {// 6개 번호와 보너스 번호
			win.add(number.nextInt(45)+1);
		}
		List<Integer> L = new ArrayList<Integer>(win);
		Collections.sort(L);
		System.out.print("당첨번호: " + L);// 6개의 당첨번호와 보너스번호
		int bouns = number.nextInt(45)+1;
		System.out.print(" 보너스 번호 : " + bouns);
//		// 6개를 맞힌 복권을 찾는다
		System.out.println();
		winnerLotto(win, al, bouns);// 1등을 찾는다

	}

	static void winnerLotto(HashSet<Integer> w, List<List<Integer>> al, int bonus) {
		// 당첨번호 w에 대하여 발행된 복권 리스트 al의 모든 원소 elem에 대하여 조사한다
		int countWins[] = {0, 0 , 0, 0, 0, 0};
		for (int i = 0; i < al.size(); i++) {
			countWins[checkWinner(w, al.get(i), bonus)]++;
		}
		lottoyPrize(countWins, al.size());
	}

	static int checkWinner(HashSet<Integer> w, List<Integer> elem, int bonus) {
		// 당첨번호 w의 각 숫자를 꺼내 복권 엔트리에 포함되어 있는지를 조사
		List<Integer> L = new ArrayList<>(w);
		int count = 0;
		/*
		 * 당첨번호 각 번호를 몇개 포함하는지를 elem에 대하여 조사
		 */
		boolean check = false;
		if(elem.contains(bonus)) check=true;
		elem.retainAll(L);
		count = elem.size();
		// 구현할 부분
		switch (count) {
		case 0:
//			System.out.println("꽝");
			break;
		case 1:
//			System.out.println("꽝");
			break;
		case 2:
//			System.out.println("꽝");
			break;
		case 3:
//			System.out.println("5등 복권 " + elem + " 당첨번호:" + w);
			return 5;
		case 4:
//			System.out.println("4등 복권 " + elem + " 당첨번호:" + w);
			return 4;
		case 5:
			if (check) { // 보너스 번호가 일치하는 지를 조사
				System.out.println("2등 복권 " + elem + " + " + bonus + " 당첨번호:" + w + "보너스 번호:[" + bonus + "]");
				return 2;
			} else {
				System.out.println("3등 복권 " + elem + " 당첨번호:" + w + "보너스 번호:[" + bonus + "]");
				return 3;
			}
		case 6:
			System.out.println("1등 복권 " + elem + " 당첨번호:" + w + "보너스 번호:[" + bonus + "]");
			return 1;
		}
		return 0;
	}
}