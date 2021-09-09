package tv;

public class TV {
	
	private int channel; // 1~255
	private int volume; // 0~100
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	
	public void power(boolean on) {
		if(on) {
			this.power = on;
		}else {
			this.power = on;
		}
	}
	
	public void channel(int channel) {
		
		if(channel >=1 && channel<=255) {
			this.channel = channel;
		}else {
			System.out.print("사용할 수 없는 채널");
		}
		
	}
	
	public void channel(boolean up) {
		
		if(up) {
			
			if(this.channel == 255) {
				this.channel = 1;
			}else {
				this.channel += 1;
			}
			
		}else {
			
			if(this.channel == 1) {
				this.channel = 255;
			}else {
				this.channel -= 1;
			}
			
		}
	
	}
	
	public void volume(int volume) {
		
		if(volume >=0 && volume<=100) {
			this.volume = volume;
		}else {
			System.out.println("잘못된 설정입니다.");
		}
	}
	
	public void volume(boolean up) {
		
		if(up) {
			
			if(this.volume == 100) {
				
			}else {
				volume += 1;
			}
			
		}else {
			
			if(this.volume == 0) {
				
			}else {
				volume -= 1;
			}
			
		}
		
	}
	


	public void status() {
		System.out.println("TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}
	

	
	
	
	
}
