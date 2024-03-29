package kh.spring.dto;

public class ReactionDTO {
	private int seq;
	private int mem_seq;
	private int loginSeq;
	private String title;
	private String nick;
	private int board_num;
	private String reactioner;
	private String reaction;
	public ReactionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReactionDTO(int seq, int mem_seq, int loginSeq, String title, String nick, int board_num, String reactioner,
			String reaction) {
		super();
		this.seq = seq;
		this.mem_seq = mem_seq;
		this.loginSeq = loginSeq;
		this.title = title;
		this.nick = nick;
		this.board_num = board_num;
		this.reactioner = reactioner;
		this.reaction = reaction;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getMem_seq() {
		return mem_seq;
	}
	public void setMem_seq(int mem_seq) {
		this.mem_seq = mem_seq;
	}
	public int getLoginSeq() {
		return loginSeq;
	}
	public void setLoginSeq(int loginSeq) {
		this.loginSeq = loginSeq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public int getBoard_num() {
		return board_num;
	}
	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}
	public String getReactioner() {
		return reactioner;
	}
	public void setReactioner(String reactioner) {
		this.reactioner = reactioner;
	}
	public String getReaction() {
		return reaction;
	}
	public void setReaction(String reaction) {
		this.reaction = reaction;
	}
	
	
}
