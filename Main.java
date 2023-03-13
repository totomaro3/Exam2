import java.util.*;

public class Main {
	
	static List<Article> articles = new ArrayList<Article>();

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==프로그램 시작==");
		
		makeTestItem();
		
		System.out.println("테스트를 위한 게시물 데이터를 생성합니다.");
		
		System.out.print("명령어 ) ");
		
		String s = sc.nextLine();
		
		if(s.equals("post list")) {
			System.out.println(" 번호 |   제목");
			for(Article article : articles) {
				System.out.printf("%d | %s",article.id,article.title);
			}
		}
		
		if(s.equals("post write")) {
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			System.out.print("내용 : ");
			String content = sc.nextLine();
			
			Article article = new Article(title,content);
			
			System.out.print("4번 글이 생성되었습니다.");
		}
		
		else if(s.equals("post detail 4")) {
			
			Article article = articles.get(4);
			System.out.println("번호 : "+article.id);
			System.out.println("날짜 : "+article.regDate);
			System.out.println("제목 : "+article.title);
			System.out.println("내용 : "+article.content);
		}
		
		else if(s.equals("post modify 4")) {
			
			Article article = articles.get(4);
			System.out.print("제목 : ");
			article.title = sc.nextLine();
			System.out.print("내용 : ");
			article.content = sc.nextLine();
			System.out.print("4번 게시물을 수정했습니다.");
		}
		
		else if(s.equals("post delete 4")) {
			
			Article article = articles.get(4);
			articles.remove(4);
			System.out.print("4번 게시물을 삭제했습니다.");
		}
		
	}
	static void makeTestItem() {
		
		Article article1 = new Article("제목1","내용1");
		Article article2 = new Article("제목2","내용2");
		Article article3 = new Article("제목3","내용3");
		
	}
}
class Article {
	static int lastArticleId = 0;
	int id;
	String regDate;
	String title;
	String content;
	
	Article(String title, String content) {
		this.id = ++lastArticleId;
		this.regDate = "0";
		this.title = title;
		this.content = content;
	}
}