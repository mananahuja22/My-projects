
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

class QuestionSeries{
static String info ="Java Online Test Week  \n \nINSTRUCTIONS:\nThere are 25 questions in this test and 10 minutes to complete them all.\nThe finish button is highlighted in green when you reach the end of the test. \nClicking the finish button will display the results with the correct answers marked in light red.  \n \nThe timecounter  begins when you click on the 'start' button \n \nBest of luck!\n";

static String [][]question ={{"Question 1:\n\nWhich language is written in five scripts?",						/*Questions 1*/
"Question 2:\n\nCONDENSATION is the reverse process of?",
"Question 3:\n\nWhich country ranks second in terms of largest land area?",
"Question 4:\n\nWhich river carries maximum amount of water in the sea?",
"Question 5:\n\nWhere is the permanent secretariat of SAARC located?",
"Question 6:\n\nWhen is the WORLD ENVIRONMENT DAY celebrated?",
"Question 7:\n\nIn which year was UNO formed?",
"Question 8:\n\nWho is the author of Harry Potter?",
"Question 9:\n\nIn which ocean is Hawaii situated?",
"Question 10:\n\nHow many legs does a butterfly has?",
"Question 11:\n\nWhich is the most common element on earth?",
"Question 12:\n\nHow many tentacles does an octopus have?",
"Question 13:\n\nWhich planet has rings around it?",
"Question 14:\n\nWhat is the main use of Quinine?",
"Question 15:\n\nHow many is a Baker's dozen?",
"Question 16:\n\nWhich one of the following is not a primary colour?",
"Question 17:\n\nIn which country did Sherpa's originate?",
"Question 18:\n\nWhich is the largest gland in human body?",
"Question 19:\n\nWhich is the fastest mammal on earth?",
"Question 20:\n\nWhich sport is called the Sport of Kings?",
"Question 21:\n\nHow many years you have been married for a diamond anniversary?",
"Question 22:\n\nSumo Wrestling originated in which country?",
"Question 23:\n\nWhich element's chemical symbol is Pb?",
"Question 24:\n\nHow many years are there in a millenium?",
"Question 25:\n\nWhich is the largest coffee growing country in the world?"},
{"Question 1:\n\nWhich crop is sown on the largest area in India?",								/*Questions 2*/
"Question 2:\n\nWho is the first non-indian to receive the Bharat Ratna?",
"Question 3:\n\nWhich is the Land of the Rising Sun?",
"Question 4:\n\nWho invented the Analytical Engine?",
"Question 5:\n\nNight blindness is caused due to deficiency of",
"Question 6:\n\nWhere is the head quarters of world trade organisation located?",
"Question 7:\n\nWhich country is without income tax?",
"Question 8:\n\nWhich one among the following radiations carries maximum energy?",
"Question 9:\n\nWhich is the most populous city in the world?",
"Question 10:\n\nWhen did the second world war began?",
"Question 11:\n\nWhich is the largest ocean in the world?",
"Question 12:\n\nJava was originally invented by",
"Question 13:\n\nWho wrote the book 'Origin of Species'?",
"Question 14:\n\nWhich of the following is an example for first generation computers?",
"Question 15:\n\nIn which one of the following animals is skin a respiratory organ?",
"Question 16:\n\nWhich among the following country is also known as Crossroads of Central Asia?",
"Question 17:\n\nWhen was the first television first introduced in India?",
"Question 18:\n\nThe hottest planet in the solar system?",
"Question 19:\n\nWhere is the Headquarters of UNO situated ?",
"Question 20:\n\nOn the surface of the moon the weight of a man-",
"Question 21:\n\nWhat is the main component of biogas and natural gas?",
"Question 22:\n\nPure water freezes at what temperature?",
"Question 23:\n\nWhich was the first Indian Satellite?",
"Question 24:\n\nWho founded the Red Cross?",
"Question 25:\n\nWhich vitamin is abundant in citrus fruits?"}};



static String [][][]answers ={{{"\nHindi","\nUrdu","\nKonkani","\nTelugu"},					/*answers 1*/
{"\nMelting","\nEvaporation","\nFreezing","\nSolidifying"},
{"\nChina","\nIndia","\nCanada","\nRussia"},
{"\nAmazon","\nNile","\nGanga","\nThames"},
{"\nKathmandu","\nWashington","\nToronto","\nLondon"},
{"\n5 July","\n5 May","\n4 May","\n5 June"},
{"\n1944","\n1946","\n1947","\n1945"},
{"\nCharles Dickens","\nEnid Blyton","\nJ.K Rowling","\nJane Austen"},
{"\nIndian","\nArctic","\nAntarctic","\nPacific"},
{"\n8","\n10","\n6","\n4"},
{"\nOxygen\n","\nMagnesium","\nSilicon","\nHydrogen"},
{"\n8","\n10","\n12","\n14"},
{"\nSaturn","\nNeptune","\nUranus","\nJupiter"},
{"\nPrevent Fever","\nPrevent Small Pox","\nPrevent Malaria","\nPrevent Chicken Pox"},
{"\n11","\n12","\n10","\n13"},
{"\nRed","\nBlue","\nYellow","\nGreen"},
{"\nChina","\nNepal","\nBhutan","\nIndia"},
{"\nThyroid Gland","\nKidney","\nPituitary","\nLiver"},
{"\nElephant","\nTiger","\nCheetah","\nHumans"},
{"\nPolo","\nHorse Racing","\nCricket","\nIce Hockey"},
{"\n50","\n60","\n75","\n100"},
{"\nArgentina","\nThailand","\nJapan","\nChina"},
{"\nIron","\nZinc","\nLead","\nPotassium"},
{"\n100","\n1000","\n10,000","\n10"},
{"\nBrazil","\nSri Lanka","\nZambia","\nIndia"}},
{{"\nRice","\nWheat","\nSugarcane","\nMaize"},
{"\nMartin Luther King","\nMother Terasa","\nKhan Abdul Ghaffar Khan","\nAubin Mehta"},
{"\nChina","\nIndia","\nCanada","\nRussia"},
{"\nAmazon","\nNile","\nGanga","\nThames"},
{"\nKathmandu","\nWashington","\nToronto","\nLondon"},
{"\n5 July","\n5 May","\n4 May","\n5 June"},
{"\n1944","\n1946","\n1947","\n1945"},
{"\nCharles Dickens","\nEnid Blyton","\nJ.K Rowling","\nJane Austen"},
{"\nIndian","\nArctic","\nAntarctic","\nPacific"},
{"\n8","\n10","\n6","\n4"},
{"\nOxygen\n","\nMagnesium","\nSilicon","\nHydrogen"},
{"\n8","\n10","\n12","\n14"},
{"\nSaturn","\nNeptune","\nUranus","\nJupiter"},
{"\nPrevent Fever","\nPrevent Small Pox","\nPrevent Malaria","\nPrevent Chicken Pox"},
{"\n11","\n12","\n10","\n13"},
{"\nRed","\nBlue","\nYellow","\nGreen"},
{"\nChina","\nNepal","\nBhutan","\nIndia"},
{"\nThyroid Gland","\nKidney","\nPituitary","\nLiver"},
{"\nElephant","\nTiger","\nCheetah","\nHumans"},
{"\nPolo","\nHorse Racing","\nCricket","\nIce Hockey"},
{"\n50","\n60","\n75","\n100"},
{"\nArgentina","\nThailand","\nJapan","\nChina"},
{"\nIron","\nZinc","\nLead","\nPotassium"},
{"\n100","\n1000","\n10,000","\n10"},
{"\nBrazil","\nSri Lanka","\nZambia","\nIndia"}}
};


static int [][]n = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
static int [][]choice={{3,2,3,1,1,4,4,3,4,3,4,1,1,3,4,4,2,4,3,2,2,3,3,2,1},{3,2,3,1,1,4,4,3,4,3,4,1,1,3,4,4,2,4,3,2,2,3,3,2,1}};
static int tally = choice[1].length;
static String testtitle="Java Programming Online Test";
static int timeLimit =10;
static int passMark = 33;
}

public class yup extends javax.swing.JFrame {

    static String studentname ="";
    static int TOTAL=0;
    Random rnum = new Random();
    final int z = rnum.nextInt(2);
    int key[]=new int[25];
	static {
	try{
	TOTAL = QuestionSeries.tally;		
	/* 	The input window */
	studentname = JOptionPane.showInputDialog("Enter Your Name:");
	if(studentname.length() < 1) studentname = "Anonymous";
	else studentname = studentname.trim() + " ";
	}catch(NullPointerException e){ System.exit(0); }
	}	

    	int seconds=0, minutes=0;
    	int quesnum=0, itemCheck, mark; 
	final String TESTTITLE = QuestionSeries.testtitle;
    	final int TIMELIMIT = QuestionSeries.timeLimit;
    	final int PASS = QuestionSeries.passMark;
    	String []answers = new String[TOTAL];
        boolean start_test, check_answer, allowRestart, finishtest;
 
    public yup() {
        initComponents();
        Message.setText(studentname+" Welcome to the quiz !!!");
    }

class Timer extends Thread implements Runnable
    {
        public Timer(){new Thread(this).start();}
        public void run(){
	while(start_test){
            try {
               Thread.sleep(1000);
               seconds++;
                    if(seconds % 60 == 0 && seconds != 0)
                    {
                    seconds -= 60;
                    minutes++;
                    }
		TimerDisp.setText(minutes+"mins:"+seconds+"secs");
                    if(minutes==TIMELIMIT)
                    {
                    start_test=false;
                    endTest();
                    }
		}
            catch(InterruptedException ex)  { System.out.print(ex); }
		}}}

/**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        right = new javax.swing.ButtonGroup();
        h = new javax.swing.JFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        LLLLL = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        QuesArea = new javax.swing.JTextPane();
        TimerDisp = new javax.swing.JLabel();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        Start = new javax.swing.JButton();
        Finish = new javax.swing.JButton();
        CheckPrevious = new javax.swing.JButton();
        CheckNext = new javax.swing.JButton();
        Message = new javax.swing.JTextField();

        LLLLL.setColumns(20);
        LLLLL.setRows(5);
        jScrollPane2.setViewportView(LLLLL);

        javax.swing.GroupLayout hLayout = new javax.swing.GroupLayout(h.getContentPane());
        h.getContentPane().setLayout(hLayout);
        hLayout.setHorizontalGroup(
            hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        hLayout.setVerticalGroup(
            hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quiz");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        QuesArea.setEditable(false);
        QuesArea.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        QuesArea.setForeground(new java.awt.Color(51, 102, 255));
        jScrollPane1.setViewportView(QuesArea);

        TimerDisp.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        TimerDisp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TimerDisp.setText("0mins:0secs");
        TimerDisp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "TIMER"));

        option1.setBackground(new java.awt.Color(255, 255, 255));
        right.add(option1);
        option1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        option1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        option2.setBackground(new java.awt.Color(255, 255, 255));
        right.add(option2);
        option2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        option2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        option3.setBackground(new java.awt.Color(255, 255, 255));
        right.add(option3);
        option3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        option3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        option4.setBackground(new java.awt.Color(255, 255, 255));
        right.add(option4);
        option4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        option4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        Start.setText("START");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        jPanel1.add(Start);

        Finish.setText("Finish");
        Finish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishActionPerformed(evt);
            }
        });
        jPanel1.add(Finish);

        CheckPrevious.setText("Check Previous");
        CheckPrevious.setEnabled(false);
        CheckPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckPreviousActionPerformed(evt);
            }
        });
        jPanel1.add(CheckPrevious);

        CheckNext.setText("Check Next");
        CheckNext.setEnabled(false);
        CheckNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckNextActionPerformed(evt);
            }
        });
        jPanel1.add(CheckNext);

        Message.setEditable(false);
        Message.setColumns(3);
        Message.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        Message.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TimerDisp, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(option1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(option3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(option2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(option4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TimerDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Message))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
if(start_test!=true)
{
start_test=true;
if(TIMELIMIT >0)new Timer();
Start.setText("NEXT");
}
else
{
    record();
    quesnum++;
}
displayQuestion();
    }//GEN-LAST:event_StartActionPerformed

    private void CheckPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckPreviousActionPerformed
        if(quesnum<=0){quesnum=25;}
        quesnum--;
        markanswer();
        markchoice();
        check();
        displayQuestion();
    }//GEN-LAST:event_CheckPreviousActionPerformed

    private void FinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishActionPerformed
        h.setVisible(true);
        try{
            if(quesnum>=25){
        CheckNext.setEnabled(true);
        CheckPrevious.setEnabled(true);
        Start.setEnabled(false);
        Finish.setEnabled(false);
        for(quesnum=0;quesnum<25;quesnum++)
        {
        LLLLL.setText(LLLLL.getText()+key[quesnum]);
        }
            }
        else
        {
           JOptionPane.showMessageDialog(null,"Please Go Through All The Questions First");
        }
        }
        catch(Exception e){JOptionPane.showMessageDialog(null, e);}
       
        
    }//GEN-LAST:event_FinishActionPerformed

    private void CheckNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckNextActionPerformed
        if(quesnum>=25){quesnum=0;}
        markanswer();
        markchoice();
        check();
        displayQuestion();
        quesnum++;
    }//GEN-LAST:event_CheckNextActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(yup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new yup().setVisible(true);
            }
        });
    }

    public void displayQuestion()
    {
        right.clearSelection();;
        if(25>quesnum)
        {
        QuesArea.setText(QuestionSeries.question[z][quesnum]);
        option1.setText(QuestionSeries.answers[z][quesnum][0]);
        option2.setText(QuestionSeries.answers[z][quesnum][1]);
        option3.setText(QuestionSeries.answers[z][quesnum][2]);
        option4.setText(QuestionSeries.answers[z][quesnum][3]);
        }
        else
        {
            Start.setEnabled(false);
        }
    }
    public void endTest()
    {
		Message.setText("TIME OVER: please press 'finish'");
    }
    
    public void check()
    {
        if(key[quesnum]==QuestionSeries.choice[z][quesnum])
        {
            Message.setForeground(Color.green);
            Message.setText("CORRECT ANSWER !!!");
        }
        else
        {
            Message.setForeground(Color.red);
            Message.setText("YOU GOT THIS WRONG !!!");
        }
    }
    
    public void markanswer()
    {
        option1.setForeground(new Color(0,0,0));
        option2.setForeground(new Color(0,0,0));
        option3.setForeground(new Color(0,0,0));
        option4.setForeground(new Color(0,0,0));
        if(QuestionSeries.choice[z][quesnum]==1)
        {option1.setForeground(new Color(0,190,0));}
        else if(QuestionSeries.choice[z][quesnum]==2)
        {option2.setForeground(new Color(0,190,0));}
        else if(QuestionSeries.choice[z][quesnum]==3)
        {option3.setForeground(new Color(0,190,0));}
        else if(QuestionSeries.choice[z][quesnum]==4)
        {option4.setForeground(new Color(0,190,0));}
    }
    
    public void record()
    {
    
        if(option1.isSelected())
        {
            key[quesnum]=1;
        }
        else if(option2.isSelected())
        {
            key[quesnum]=2;
        }
        else if(option3.isSelected())
        {
            key[quesnum]=3;
        }
        else if(option4.isSelected())
        {
            key[quesnum]=4;
        }
        else
        {
          JOptionPane.showMessageDialog(null,"Please Select An Option !");
          quesnum--;
        }
    }
    public void markchoice()
    {
        if(QuestionSeries.choice[z][quesnum]!=key[quesnum])
        {
            if(key[quesnum]==1)
        {option1.setForeground(new Color(225,0,0));}
           else if(key[quesnum]==2)
        {option2.setForeground(new Color(225,0,0));}
           else if(key[quesnum]==3)
        {option3.setForeground(new Color(225,0,0));}
           else if(key[quesnum]==4)
        {option4.setForeground(new Color(225,0,0));}
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CheckNext;
    private javax.swing.JButton CheckPrevious;
    private javax.swing.JButton Finish;
    private javax.swing.JTextArea LLLLL;
    private javax.swing.JTextField Message;
    private javax.swing.JTextPane QuesArea;
    private javax.swing.JButton Start;
    private javax.swing.JLabel TimerDisp;
    private javax.swing.JFrame h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton option1;
    private javax.swing.JRadioButton option2;
    private javax.swing.JRadioButton option3;
    private javax.swing.JRadioButton option4;
    private javax.swing.ButtonGroup right;
    // End of variables declaration//GEN-END:variables
}