findById
===
*通过id查找用户

    SELECT id,real_name,user_name,password FROM user WHERE id=#id#


findAll
===
*查找所有用户

    SELECT 
    @pageTag(){
        id,real_name,user_name,password
    @}
    FROM `user`