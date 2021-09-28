function confirmDelete(customerName){
    if(confirm("Are you Sure you want to delete Customer - "+customerName))
        return true;
    else
        return false;
}