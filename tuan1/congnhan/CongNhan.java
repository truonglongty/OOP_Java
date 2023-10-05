package tuan1.congnhan;

public class CongNhan {
	private String mHo, mTen;
	private int mSoSP;
	
	public CongNhan() {}

	public CongNhan(String mHo, String mTen, int mSoSP) {
		super();
		this.mHo = mHo;
		this.mTen = mTen;
		this.mSoSP = mSoSP;
	}

	public String getmHo() {
		return mHo;
	}

	public void setmHo(String mHo) {
		this.mHo = mHo;
	}

	public String getMTen() {
		return mTen;
	}

	public void setMTen(String mTen) {
		this.mTen = mTen;
	}

	public int getmSoSP() {
		return mSoSP;
	}

	public void setmSoSP(int mSoSP) {
		if(mSoSP > 0)
			this.mSoSP = mSoSP;
	};
	
	public double tinhLuong() {
		if(mSoSP >= 1 && mSoSP <= 199)
			return mSoSP * 0.5;
		else if(mSoSP >= 200 && mSoSP <= 399)
			return mSoSP * 0.55;
		else if(mSoSP >= 400 && mSoSP <= 599)
			return mSoSP * 0.6;
		else
			return mSoSP * 0.65;
	}
	
	@Override
	public String toString() {
		return "Họ: "+mHo+", Tên: "+mTen+", Số sản phẩm: "+mSoSP+", Lương: "+tinhLuong();
	}
	
	
}
