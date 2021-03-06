package p14_work1;

import java.util.List;

public class Player {
	private String name;
	private int	gotNum,
				winCount;
	List<Card> hand;

//getter
	//プレイヤー名
	public String getName() {
		return this.name;
	}
	//獲得数
	public int getGotNum() {
		return this.gotNum;
	}
	//勝利数
	public int getWinCount() {
		return this.winCount;
	}
	//手札
	public List<Card> getHand() {
		return this.hand;
	}
	//手札数
	public int getHandNum() {
		return this.hand.size();
	}

//setter
	//獲得数
	public void setGotNum(int gotNum) {
		this.gotNum = gotNum;
	}
	//勝利数
	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

//コンストラクタ(名前、手札)
	//初期化
	Player(String name, int gotNum, List<Card> handPlayer) {
		this.name = name;
		this.gotNum = gotNum;	//獲得枚数0
		this.hand = handPlayer;
	}

//中断データ作成用
	public String toBreakFormat() {
		String toReturn = "";
		for(int i = 0; i < hand.size(); i++) {
			toReturn += hand.get(i).toString();
			if(i != hand.size() - 1) {
				toReturn += ",";
			}
		}
		return toReturn;
	}
}
