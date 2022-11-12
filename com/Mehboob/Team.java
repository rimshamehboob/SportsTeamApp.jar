package com.Mehboob;
class Team 
{
    private String teamName="";
    private String [] players = new String[20];
    private int playerCount =0;

    private void addPlayerData(String players[])
    {
        int len = players.length;
        for(int x=0;x<len;x++)
        {
            this.players[x] = players[x];
        }

        //change the value of player count
        playerCount = len;

    }

    /**
     * Initialize team data
     * @param teamName
     */
    public Team(String teamName,String players[])
    {
        this.teamName = teamName;
        addPlayerData(players);

    }
    /**
     * Adds a player players array
     * @param player
     */
    public void addPlayer(String player)
    {
        int count = this.players.length;
        this.players[count] = player;
    }

    /**
     * Returns players data field
     * @return
     */
    public String [] getPlayers()
    {
        return this.players;
    }

    /**
     * Returns players count
     * @return
     */
    public int getPlayerCount()
    {
        return this.playerCount;
    }

    public String getTeamName()
    {
        return this.teamName;
    }

    public String getPlayersOnTheTeam()
    {
        StringBuilder sb = new StringBuilder();
        for(int x=0;x<playerCount;x++)
        {
            sb.append(this.players[x]);
            sb.append(",");
        }

        String playerString = sb.toString();
        return playerString;
    }

}