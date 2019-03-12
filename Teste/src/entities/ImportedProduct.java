package entities;

	import java.text.SimpleDateFormat;

	public class ImportedProduct extends Product{
		
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		private Double customsFee;
		
		public ImportedProduct() {
		}

		public ImportedProduct(String name, Double price, Double customsFee) {
			super(name, price);
			this.customsFee = customsFee;
		}

		public Double getCustomsFee() {
			return customsFee;
		}

		public void setCustomsFee(Double customsFee) {
			this.customsFee = customsFee;
		}
		
		@Override
		public String priceTag() {
			return getName() + "\n $ " + totalPrice() + "\n (Custom fee = " + getCustomsFee() + ")";
		}
		
		public double totalPrice () {
			return super.getPrice() + customsFee;
		}

	}



