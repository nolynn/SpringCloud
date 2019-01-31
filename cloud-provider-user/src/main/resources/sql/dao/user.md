findById
===
*通过id查找用户

    SELECT id,real_name,user_name,password FROM user WHERE id=#id#  

sql
===
    id,real_name,user_name,password

findAll
===
*查找所有用户

    SELECT 
    @pageTag(){
        #globalUse("dao.base.sqlBase")#
    @}
    FROM user