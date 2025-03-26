package Question_Bank;
import java.util.*;

public class Question_Bank_Application {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList al = new ArrayList();
		do {
			System.out.println("1: Add new Question ");
			System.out.println("2: View All Questions ");
			System.out.println("3: Search Question");
			System.out.println("4: Delete Question by ID");
			System.out.println("5: Exit");

			System.out.println("Enter Your Choice ");
			int ch = sc.nextInt();

			switch (ch) {
			case 1:
				System.out.println("Enter The Question Details :");
				System.out.print("Enter The Question ID :");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter The Question :");
				String qname = sc.nextLine();
				System.out.print("Enter The 4 Options :");
				String op1 = sc.nextLine();
				String op2 = sc.nextLine();
				String op3 = sc.nextLine();
				String op4 = sc.nextLine();
				System.out.print("Enter The Answer :");
				String ans = sc.nextLine();

				Question q = new Question(id, qname, op1, op2, op3, op4, ans);
				al.add(q);
				break;

			case 2:
				Iterator itr = al.iterator();
				System.out.println("ID\tQue1\tOp1\tOp2\tOp3\tOp4\tAnswer");
				while (itr.hasNext()) {
					Object obj = itr.next();
					Question que = (Question) obj;
					System.out.println(que.getId() + "\t" + que.getQname() + "\t" + que.getOp1() + "\t" + que.getOp2()
							+ "\t" + que.getOp3() + "\t" + que.getOp4() + "\t" + que.getAns());

				}
				break;

			case 3:
				System.out.println("Enter The Question Id for Search :");
				int qid = sc.nextInt();

				boolean flag = false;
				itr = al.iterator();
				while (itr.hasNext()) {
					Object obj = itr.next();
					Question ques = (Question) obj;
					if (ques.getId() == qid) {
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Question Found By ID ");
				} else {
					System.out.println("Question Not Found...");
				}
				break;

			case 4:
				System.out.println("Enter The Question Id for Delete :");
				qid = sc.nextInt();

				flag = false;
				itr = al.iterator();
				while (itr.hasNext()) {
					Object obj = itr.next();
					Question ques = (Question) obj;
					if (ques.getId() == qid) {
						int ind = al.indexOf(ques);
						al.remove(ind);
						flag = true;
						break;
					}
				}
				if (flag) {
					System.out.println("Question Deleted from Collection ");
				} else {
					System.out.println("Question Not Deleted...");
				}
				break;

			case 5:
				
				System.exit(ch);
				break;

			default:
				System.out.println("Invalid Input...");
			}

			
		} while (true);

	}

}
