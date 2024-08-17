# Product & Sale Management System

This project is a Java-based system for managing products and sales data, providing functionalities to save, retrieve, and display this information from files or terminal input.

## Project Structure

### 1. Product Management

- **Product Class**: Contains attributes such as `name`, `price`, `productNum`, and `id`.
- **ProductFileDataSource Class**: Handles saving and retrieving products from a file. Supports operations for both individual and multiple products.
- **ProductInputDataSource Class**: Reads product information from the terminal and saves it. Supports operations for both individual and multiple products.
- **ProductDataSource Interface**: Defines the methods used in `ProductFileDataSource` and `ProductInputDataSource`.

### 2. Sale Management

- **Sale Class**: Represents a sale with attributes like `id`, `numSale`, and `date`.
- **SaleFileDataSource Class**: Handles saving and retrieving sales from a file. Supports operations for both individual and multiple sales.
- **SaleInputDataSource Class**: Reads sale information from the terminal and saves it. Supports operations for both individual and multiple sales.
- **SaleDataSource Interface**: Defines the methods used in `SaleFileDataSource` and `SaleInputDataSource`.

### 3. Repository

- **Repository Class**: Integrates the various data source classes and provides methods such as `saveProduct`, `saveProducts`, `saveSale`, `saveSales`, `printProduct`, `printProducts`, `printSale`, and `printSales`.

### 4. Main Class

- **Main Class**: Provides an interactive terminal interface allowing the user to:
  - Print all products.
  - Print the last added product.
  - Print all sales.
  - Print the last sale.
  - Save a new product or multiple products.
  - Save a new sale or multiple sales.
