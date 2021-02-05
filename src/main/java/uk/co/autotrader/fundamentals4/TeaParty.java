package uk.co.autotrader.fundamentals4;

public class TeaParty {
    public static void main(String[] args) {
        int tea = 1;
        int candy = 1;

        System.out.println(teaPartyLogic(tea, candy ));

        //didn;t ask for a text output so none provided
    }

    public static int teaPartyLogic(int tea, int candy) {
        int partyStatus;
         if (tea < 5 || candy < 5) {
             partyStatus = 0;
         }
         else if (tea == 2 * candy || candy == 2 * tea) {
             partyStatus = 2;
         }
         else {
             partyStatus =1;
         }
        return partyStatus;
    }
}
