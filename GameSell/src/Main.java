import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Game game1=new Game();
		game1.gameName="Star wars";
		GameManager gm=new GameManager();
		gm.add(game1);
		User user1=new User("ali","can","1999-2-2","1234567890");
		UserManager um=new UserManager();
		um.add(user1);
		um.delete(user1);
		Campaign.add(game1);
	}

}
