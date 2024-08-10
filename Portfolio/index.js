document.addEventListener('DOMContentLoaded', function () {
    const projectItems = document.querySelectorAll('.project-item');

    projectItems.forEach(item => {
        const projectInfo = item.querySelector('.project-info');
        const projectLinks = item.querySelector('.project-links');

        item.addEventListener('mouseenter', function () {
            projectInfo.style.transform = 'translateY(0)';
            projectInfo.style.opacity = '1';
        });

        item.addEventListener('mouseleave', function () {
            projectInfo.style.transform = 'translateY(100%)';
            projectInfo.style.opacity = '0';
        });

        const githubLink = projectLinks.querySelector('.btn:nth-child(1)');
        const youtubeLink = projectLinks.querySelector('.btn:nth-child(2)');

        githubLink.addEventListener('click', function (event) {
            event.stopPropagation(); // Prevents the link from triggering parent click events
            window.open(githubLink.href, '_blank');
        });

        youtubeLink.addEventListener('click', function (event) {
            event.stopPropagation(); // Prevents the link from triggering parent click events
            window.open(youtubeLink.href, '_blank');
        });
    });
});


document.addEventListener("DOMContentLoaded", () => {
    const skillElements = document.querySelectorAll(".skill");
    const skillDetailsContainer = document.getElementById("skill-details");

    const skillDetails = {
        HTML5: "HTML5 is the latest version of Hypertext Markup Language, the code that describes web pages. It is the fifth and current version of the HTML standard.",
        CSS3: "CSS3 is the latest evolution of the Cascading Style Sheets language, bringing new features and capabilities for web developers.",
        JavaScript: "JavaScript is a versatile programming language commonly used in web development to create interactive effects and dynamic content on websites.",
        PHP: "PHP is a server-side scripting language designed for web development but also used as a general-purpose programming language.",
        AWS: "Amazon Web Services (AWS) is a comprehensive, evolving cloud computing platform provided by Amazon, offering a wide range of services including computing power, storage, and databases.",
        Azure: "Microsoft Azure is a cloud computing service created by Microsoft for building, testing, deploying, and managing applications and services through Microsoft-managed data centers."
    };

    skillElements.forEach(skillElement => {
        skillElement.addEventListener("click", () => {
            const skill = skillElement.getAttribute("data-skill");
            skillDetailsContainer.innerHTML = `<p>${skillDetails[skill]}</p>`;
            skillDetailsContainer.style.display = "block";
        });
    });
});
