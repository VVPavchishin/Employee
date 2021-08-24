<#import "parts/common.ftlh" as co>

<@co.page>
    <table class="table" style="margin-top: 10rem; text-align: center;">
        <thead class="thead-dark">
        <tr>
            <th scope="col">First name</th>
            <th scope="col">Last name</th>
            <th scope="col">Country</th>
            <th scope="col">Bank count</th>
            <th scope="col">Car</th>
        </tr>
        </thead>
        <tbody>
        <#list customers as customer>
        <tr>
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
            <td>${customer.country}</td>
            <td>${customer.bankCount}</td>
            <td>${customer.car}</td>
        </tr>
        </#list>
        </tbody>
    </table>

</@co.page>