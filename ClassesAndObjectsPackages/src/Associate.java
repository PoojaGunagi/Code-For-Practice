
public class Associate {

	private int associateId;
	private String associateName;
	private String workStatus;
	public void setAssociateId(int assciateId)
	{
		this.associateId =assciateId;
	}
	public int getAssociateId()
	{
		return associateId;
	}
	public void setAssociateName(String assciateName)
	{
		this.associateName =assciateName;
	}
	public String getAssociateName()
	{
		return associateName;
	}
	public void setWorkStatus(String workStatus)
	{
		this.workStatus =workStatus;
	}
	public String getWorkStatus()
	{
		return workStatus;
	}
	public void TrackAssociateStatus(int days)
	{
		if(days<=20)
		{
			this.workStatus="Core Skills";
		}

		if(days>20 && days<=40)
		{
			this.workStatus="Advanced Skills";
		}

		if(days>40 && days<=60)
		{
			this.workStatus="project Phase";
		}

		if(days>60)
		{
			this.workStatus="Diployed in project";
		}
		
	}
}
