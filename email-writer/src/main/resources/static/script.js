async function generateReply() {

    const emailContent = document.getElementById("emailContent").value;

    const tone = document.getElementById("tone").value;

    if(emailContent.trim() === ""){

        alert("Please enter email content.");

        return;
    }

    document.getElementById("loading").style.display="block";

    try{

        const response = await fetch("/api/email/generate",{

            method:"POST",

            headers:{
                "Content-Type":"application/json"
            },

            body:JSON.stringify({

                emailContent:emailContent,

                tone:tone

            })

        });

        const reply = await response.text();

        document.getElementById("reply").value=reply;

    }catch(e){

        alert("Something went wrong.");

        console.error(e);

    }finally{

        document.getElementById("loading").style.display="none";
    }

}

function copyReply(){

    const reply=document.getElementById("reply");

    reply.select();

    document.execCommand("copy");

    alert("Reply copied!");
}