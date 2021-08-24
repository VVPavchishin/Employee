<#import "parts/common.ftlh" as co>

<@co.page>
    <form name="customer" action="/customer/add" method="post" style="margin: 10rem">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="inputFirstName">Last name</label>
                <input type="text" class="form-control" name="lastName">
            </div>
            <div class="form-group col-md-6">
                <label for="inputLastName">First name</label>
                <input type="text" class="form-control" name="firstName">
            </div>
        </div>
        <div class="form-group">
            <label for="inputBankCount">Bank count</label>
            <input type="number" class="form-control" name="bankCount" placeholder="$$$$$$">
        </div>
        <div class="form-group">
            <label for="inputCar">Car</label>
            <input type="text" class="form-control" name="car" placeholder="BMW AUDI">
        </div>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="inputCountry">Country</label>
                <input type="text" class="form-control" name="country">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Save</button>
    </form>
</@co.page>