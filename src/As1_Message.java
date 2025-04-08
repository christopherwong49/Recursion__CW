public class As1_Message {
    private String machineType;
    private String machineId;
    private String warning;

    public As1_Message(String message){
        for (int i = 0; i <message.length(); i++) {
            if(message.charAt(i) == ':'){
                machineType = message.substring(0, i-1);
                machineId = message.substring(i-1, i);
                warning = message.substring(i+1).trim();
            }
        }
    }

    public String getMachineType() {
        return machineType;
    }

    public String getMachineId() {
        return machineId;
    }

    public String getWarning() {
        return warning;
    }
}