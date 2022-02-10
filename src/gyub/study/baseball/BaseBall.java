package gyub.study.baseball;

import java.util.ArrayList;
import java.util.List;

/**
 * 숫자 야구 알고리즘
 * @author Gyub
 *
 */

/*
 * 상대방의 임의의 숫자 3자리를 맞추는 게임 
 * 서로 임의의 숫자 3자리를 정한다 ( 123 , 346)
 * 정한이후 서로 번갈아가며 상대방의 숫자를 유추하며 게임을 진행
 * 
 * 3자리의 숫자를 외친다
 * 외친 숫자중 숫자는 맞지만, 자릿수의 위치가 다르면 볼
 * 숫자와 위치가 다 맞으면 스트라이크
 * 숫자가 다르면 아웃
 * 
 * */

public class BaseBall {

	private List candidates = new ArrayList();
	
	public BaseBall(){
		// 백의자리
		for(int hundredsIDX = 1; hundredsIDX <= 9; hundredsIDX++) {
			
			// 십의자리
			for(int tensIDX = 1; tensIDX<= 9;tensIDX++) {
				if( tensIDX != hundredsIDX ) {
					// 일의자리
					for(int onesIDX = 1; onesIDX <= 9; onesIDX++) {
						if( onesIDX != tensIDX && onesIDX != hundredsIDX) {
							String str = String.valueOf(hundredsIDX) + String.valueOf(tensIDX) + String.valueOf(onesIDX);
							this.candidates.add(str);
						}
					}
				}
			}
		}
		
	}
	
	
	
	public List getCandidates(String number, int strike, int ball) {
		List newCandidates = new ArrayList();
		String str[] = number.split("");
		
		int size = candidates.size();
		if (ball == 1) {
			for( int candidateIDX = 0 ; candidateIDX < size; candidateIDX++) {
				if (str[2].equals(candidates.get(candidateIDX).toString().substring(0,1)) ) {
					newCandidates.add(candidates.get(candidateIDX).toString());
				}
				if (str[1].equals(candidates.get(candidateIDX).toString().substring(0,1)) ) {
					newCandidates.add(candidates.get(candidateIDX).toString());
				}
			}
		}
		
		
		return newCandidates;
	}


	public List getCandidates() {
		return candidates;
	}

	public void setCandidates(List candidates) {
		this.candidates = candidates;
	}
}
