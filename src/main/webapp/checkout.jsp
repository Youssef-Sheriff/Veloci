<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Checkout | Veloci</title>
</head>
<body>

    <!-- Main Split Wrapper -->
    <div style="display: flex;">

        <!-- LEFT HALF: User Info & Form -->
        <div style="flex: 1; padding: 20px;">
            <form action="${pageContext.request.contextPath}/PlaceOrder" method="POST">

                <h2>Customer Information</h2>

                <div>
                    <label for="name">Full Name</label><br>
                    <input type="text" id="name" name="name" value="${Customer.name}" readonly />
                </div>

                <div>
                    <label for="email">Email Address</label><br>
                    <input type="email" id="email" name="email" value="${Customer.email}" readonly />
                </div>

                <h2>Delivery Details</h2>

                <div>
                    <label for="phone">Phone Number</label><br>
                    <input type="tel" id="phone" name="phone" value="${Customer.phone}" required />
                </div>

                <div>
                    <label for="address">Address</label><br>
                    <textarea id="address" name="address" required>${Customer.address}</textarea>
                </div>

                <h2>Payment Method</h2>

                <div>
                    <input type="radio" id="cod" name="paymentMethod" value="COD" checked onclick="return false;">
                    <label for="cod">Cash on Delivery</label>
                </div>

                <br>
                <button type="submit">Pay Now</button>

            </form>
        </div>

        <!-- RIGHT HALF: Order Items & Calculation Summary -->
        <div style="flex: 1; padding: 20px; background-color: #f0f0f0;">
            <h2>Order Summary</h2>

            <!-- Cart Items list -->
            <ul>
                <!-- Loop over your cart items here (e.g. using Java scriptlets or standard HTML placeholders) -->
                <li>
                    <span>Sample Item Name</span> - 
                    Qty: 1 - 
                    $0.00
                </li>
            </ul>

            <hr>

            <!-- Pricing Details -->
            <div>
                <p>Subtotal: $<span>${subtotal}</span></p>
                <p>Shipping: $<span>${shipping}</span></p>
                <hr>
                <h3>Total: $<span>${totalPrice}</span></h3>
            </div>
        </div>

    </div>

</body>
</html>