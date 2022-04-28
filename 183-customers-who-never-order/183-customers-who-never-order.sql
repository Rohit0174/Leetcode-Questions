select name as customers from customers AS c
left join orders AS O
ON c.ID = o.customerID where o.customerId is null;