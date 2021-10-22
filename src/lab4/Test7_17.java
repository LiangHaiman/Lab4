package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class Test7_17 {

	public static void main(String[] args) {
        //1. ����������ȡѧ����������Ϊ�����ͳɼ���������ĳ���
        Scanner input = new Scanner(System.in);
        System.out.print("����ѧ��������");
        int length = input.nextInt();

        //1+. ������������
        String[] names = new String[length];
        int[] scores = new int[length];

        //2. ��������ʹ��forѭ����ȡѧ�������ͳɼ���ѧ��������ɼ������ȡ������ֵ����������Ķ�Ӧλ��
        System.out.print("���������ɼ���");
        for (int i = 0 ; i < length ; i++){
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        //3. �������������Զ��巽��sort()�������������鲢�������򣬷���ֵ�������ɼ���Ӧ����������
        String[] names_feedback = new String[length];
        names_feedback = sort(names, scores);

        //5. ��������������ص�����
        System.out.print(Arrays.toString(names_feedback));
    }
    //4. sort�������ڶԳɼ�����������򣨽���λ�ã���ͬʱ��������Ҳ��ͬ������λ�õĲ���
    public static String[] sort(String[] names, int[] scores){
        //1. ����һ��String���飨names_feedback�����ڷ�������
        String[] names_feedback = new String[names.length];
        //2. ʹ��forѭ�����Ʊ���
        int index = -1;     // �������ֵ�±�
        for (int i = 0 ; i < names.length ; i++) {
            //�����Զ��巽��list_max()������scores���鲢���ճ����������ֵ���±�
            index = list_max(scores);
            //������յ������ֵ�±�index����ʱforѭ��Ϊ��i+1��
            //names_feedback[i]=names[index]; ͬʱ��scores[index]=-1
            names_feedback[i]=names[index];
            scores[index]=-1;
        }
        //3. ����names_feedback����
        return names_feedback;
    }
    //4+ �Զ��巽��list_max()������scores���鲢���ճ����������ֵ���±�
    public static int list_max(int[] scores){
        // �������ֵ�ı���temp_max�����ֵ���±�temp_index
        int temp_max = 0, temp_index = -1;
        // ��ȡscores����Ϊlength
        int length = scores.length;
        // ʹ��forѭ����ȡ���ֵ���������ƣ�
        for (int i = 0 ; i < length ; i++){
            if (temp_max < scores[i] && scores[i] >= 0){
                temp_max = scores[i];
                temp_index = i;
            }
        }
        // ���ر�������ֵ�±�temp_index
        return temp_index;
    }
}
