class BadKey {
   // no hashCode or equals();
   public final String key;
   public BadKey(String key) { this.key = key; }
}

Map map = System.getProperties();
map.put(new BadKey("key"), "value"); // Memory leak even if your threads die.

void doWork() {
    try {
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = conn.preparedStatement("some query");
        // executes a valid query
        ResultSet rs = stmt.executeQuery();
        while(rs.hasNext()) {
            // ... process the result set
        }
    } catch(SQLException sqlEx) {
        log(sqlEx);
    }
}
