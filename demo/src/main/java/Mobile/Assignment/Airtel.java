package Mobile.Assignment;

public class Airtel {
//        private Data data;
        private Calling calling;
//        private Texting texting;
//        Adding Setter methods,so that objects can be setted.
		public void setData(Data data) {
			this.data = data;
		}
//		public void setCalling(Calling calling) {
//			this.calling = calling;
//		}
//		public void setTexting(Texting texting) {
//			this.texting = texting;
//		}
        
        
        
//       Using constructors to do dependency injection:
//        public Airtel(Data data){
//        	this.data = data;
//        }
        
        public Airtel(Calling calling){
        	this.calling = calling;
        }
//        public Airtel(Texting texting){
//        	this.texting = texting;
//        }
        
        
        
//		Calling these methods from this airtel class
//		public void data() {
//			data.serviceImplementation();
//		}
		public void calling() {
			calling.serviceImplementation();
		}
//		public void texting() {
//			texting.serviceImplementation();
//		}
}
