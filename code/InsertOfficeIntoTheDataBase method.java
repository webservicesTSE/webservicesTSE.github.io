	public int InsertOfficeIntoTheDataBase(Office office) 
	{
		Connection connection = DBClass.returnConnection(); 
		PreparedStatement insert;
		try {
			insert = connection.prepareStatement("INSERT INTO office (city, manager_name,email, year_founded)" + "VALUES(?,?,?,?)");
			insert.setString(1, office.getCity());
			insert.setString(2, office.getManager_name());
			insert.setString(3, office.getEmail());
			insert.setInt(4, office.getYear_founded());
			insert.executeUpdate();
			return 200;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 400;
		}
	}
