package duzones.creativednas.com.duzones;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class collegelist extends AppCompatActivity {

    String tempcname, tempcrname, tempcolmapname, tempcoursedetailed, tempcollink, tempbroname;
    String tempcolintro, tempcourseintro;
    String tempphone,tempemail,tempaddress;

    int tempcolimage;
    Intent i;


    String[] colintro = {
            //acharya
            "Acharya Narendra Dev College was established in 1991 as a constituent college of " +
                    "University of Delhi and is fully funded by Government of NCT, Delhi. " +
                    "The college is named after the great educationist and reformist of modern India, " +
                    "Acharya Narendra Deva. Over the years, the college has acquired repute for the " +
                    "quality of education imparted to the students, the discipline and dedication of " +
                    "the students and the faculty, the exposure and opportunities available for overall " +
                    "development of both faculty and students and the sense of social responsibility " +
                    "within its walls. Extra curricular activities like sports, theatre, debates, " +
                    "music, eco-club, NSS etc engage students when they are not in class.\n" +
                    "The college is located in Govindpuri, Kalkaji and works under the aegis of Government " +
                    "of India. Acharya Narendra Dev College is a Constituent College of the University " +
                    "of Delhi that is accredited Grade ‘A’ by NAAC with a substantial score 3.31 – one amongst " +
                    "the highest scorers in the University of Delhi. The College offers Undergraduate " +
                    "and Postgraduate programs in disciplines like Science, Computer, Commerce and Mathematics.",
            //aditi
            "Aditi Mahavidyalaya was established in 1994 and since two decades has been a pioneering " +
                    "institution bringing higher education to women students. Aditi Mahavidyalaya " +
                    "believes in bringing diversity in college education and hence recognizes and " +
                    "fosters the capacities and capabilities of the students coming from different " +
                    "socio-cultural and educational milieu.\n\n Aditi Mahavidyalaya plays a dynamic " +
                    "role in bringing in women empowerment to the marginalized women population of " +
                    "Delhi rural outskirts. Aditi Mahavidyalaya offers well designed honors and " +
                    "professional courses to make the students confident, skillful and self-reliant. " +
                    "Apart from these courses, students are motivated to participate in various " +
                    "co-curricular activities for their personality enhancement. The college is proud " +
                    "of the academic commitment of its faculty members and students, who have several " +
                    "achievements to their credit and have made valuable contribution to the field of " +
                    "academia.",

            //aryabhatta
            "\n" +
                    "ARYABHATTA COLLEGE comes into existence from the academic session 2014-15. It is " +
                    "an institution directly maintained by the University of Delhi. The college was " +
                    "formerly known as Ram Lal Anand College (Evening) and was established in 1973.\n" +
                    "\n" +
                    "\n" +
                    "The working hours at the Aryabhatta College are 8:30 a.m. to 5:00 p.m. Classes " +
                    "shall commence at 8:30 a.m. \n" +
                    "\n" +
                    "The College is located adjacent to the South Campus of the University of Delhi " +
                    "in the picturesque surroundings of the South Delhi section of the the Aravali " +
                    "range. Aryabhatta College is a co-educational institution and conducts Humanities, " +
                    "Arts and Commerce courses at the undergraduate level. There are presently around " +
                    "2200 students on the rolls of the College. \n" +
                    "\n" +
                    "'Aryabhatta is the master who, after reaching the furthest shores and plumbing " +
                    "the inmost depths of the sea of ultimate knowledge of mathematics, kinematics " +
                    "and spherics, handed over the three sciences to the learned world.' \n" +
                    "\n" +
                    "Aryabhata is the author of several treatises on mathematics and astronomy. " +
                    "His major works were Aryabhatiya and Arya-siddhanta. ",


            //atmaram
            "\n" +
                    "Atma Ram Sanatan Dharma College is a premier educational institution of Delhi " +
                    "University which aims to nurture excellence in education. It emphasizes on fostering " +
                    "the quality of human resources and promoting productive ideas that benefit the " +
                    "students. Since its inception, the College as focused on character building and " +
                    "idealism inspired by Sanatani values. The College embraces Inclusivity and Equitability " +
                    "as its founding principles. Promotion of women’s education and ensuring a barrier-free," +
                    " nondiscriminatory, and supportive ecosystem for all members of the College are, " +
                    "therefore, a priority at ARSD College.\n" +
                    "\n\n" +
                    "The College is concerned primarily with creating an institution in tune with " +
                    "contemporary demands and enabling the holistic development of all its stakeholders." +
                    " College’s exponential growth over the past few years, its emphasis on undergraduate " +
                    "research, entrepreneurial initiatives, skill development, strong industry-institution " +
                    "linkages, and ICT-enabled learning environments, are geared towards the facilitation " +
                    "of sustainable and self-sufficient systems as well as institutions. The motto of the " +
                    "College, Tejasvi-naavadhitam-astu, has been taken from Taittriya Upanishad and means, " +
                    "“May our learning be endowed with radiance”. The College takes pride in its past " +
                    "achievements and looks to the future with great hope and determination.",


            //bhagini
            "Bhagini Nivedita College is a constituent college of the prestigious University of Delhi. It is located in rural and semi-urban outskirts of South West Delhi. The college was established in August, 1993 by the Delhi Administration as a girls’ college. The college is named after Sister Nivedita, a disciple of Swami Vivekananda, who dedicated her whole life for the education and welfare of women.\n" +
                    "\n\n" +
                    "The college offers a horde of undergraduate level three-year degree programs in the fields of Arts, Science and Commerce. It offers both regular and Honours courses in the said disciplines. Bhagini Nivedita College currently has eight regular B.A. courses, four B.A. Home Science specializations, two B.A. Honours courses, one B.Sc. program in Physics, two B.Sc. Honours courses and a regular B.Com program under the UG wing.\n\n"+
                    "Only applications filed through application portal of University of Delhi are considered for the purpose of admission.\n" +
                    "The institute reserves no seats under Management quota.\n" +
                    "For UG program, candidate with 10+2 examination and minimum 45% marks aggregate and 50% marks in concerned subject is required for admission.\n" +
                    "The college doesn’t provide any registration or pre-admission form to the students.\n" +
                    "Sports/ ECA/ Applications can be obtained from the college directly.\n" +
                    "All admissions are done strictly on the basis of last qualifying exam merit as per merit list/ cut off announced by the university.\n" +
                    "Candidates applying for Science (Honours) courses must secure at least 55% marks in aggregate in the qualifying exam in order to be eligible for the All India Entrance Scholarship.\n" +
                    "Reservations are offered as per norms laid by the University of Delhi.",


            //bhariti
            "A constituent college with permanent affiliation to the University of Delhi, Bharati College was founded by " +
                    "the Delhi Administration as Bharati Mahila College in September 1971. It started functioning from " +
                    "the premises of a Government Senior Secondary School for Boys located on Link Road in Karol Bagh." +
                    " With 241 students and 13 members of the staff, spread over six disciplines, for the first two " +
                    "years the college would start only at 12.00 noon after the boys school gave over. By the " +
                    "third year, however, the College had taken over the building full time. Situated tantalizingly next to the " +
                    "erstwhile Naaz Cinema and the “Mata Ka Mandir” on the one hand and the Bhuli Bhatiyari Ka Mahal and " +
                    "the Buddha Gardens on the other the College was barely a kilometre from the main Karol Bagh market on the one side " +
                    "and 3 kms. from Connaught Place on the other. " +
                    "In many ways, the location also defined the College, the ‘Pahariwala College’ as it was known in common parlance.",


            //bhaskaracharya
            "Bhaskaracharya College of Applied Sciences, named after a great mathematician of 12th Century " +
                    "was set up in October, 1995. This is a constituent college of University of Delhi and " +
                    "is fully supported and funded by Government of NCT, Delhi. The sprawling campus of the " +
                    "college spans about ten acres of land with exquisite landscaping and captivating architecture. \n\n" +
                    "The college has well equipped laboratories, extensive library facility, classrooms with LCD projectors, auditorium, " +
                    "open air theatre and a spacious sports ground. The campus of the college is wi-fi enabled. " +
                    "\nThe college provides a stimulating environment for holistic development of the students. They are " +
                    "motivated to excel in academics and attain University positions in their respective disciplines. They " +
                    "are provided with ample opportunities through participation in several extracurricular activities organized " +
                    "by various clubs, societies and committees. The societies of various " +
                    "Departments provide a platform for interaction with renowned academicians and scientists from their respective felds.",

            //Collegeofarts
            "Established in the year 1942, College of Art is a part of Faculty of Music and Fine Arts of the University of Delhi. Operated and controlled by Government of NCT of Delhi, College of Art, Delhi University offers Bachelors and Master’s Degree in Fine Arts under various specializations including Applied Art, Painting and Visual Communication. Eligible candidates are shortlisted for admission to the courses by the University of Delhi.\n" +
                    "\n\n" +
                    "Candidates seeking admission to Bachelor of Fine Arts (BFA) degree should have passed 12th or equivalent examination from a recognized board of education\n\n" +
                    "For admission to Master of Fine Arts (MFA) course, the candidate should have passed Bachelors in Arts degree or any equivalent course from a recognized university.\n\n" +
                    "In addition to BFA and MFA, the college also offers Post Graduate Diploma courses to Hearing and Speech impaired students with a limited seat intake.\n\n" +
                    "Admission to all the course offered by the College of Art is merit based.\n\n" +
                    "The application process for admission to the courses is conducted in the month of June-July every year.\n\n" +
                    "Application form can be submitted through post or in person to the college admission office.",

            //cvs
            "The College Of Vocational Studies, a maintained institution of Delhi University, was founded in " +
                    "1972. It makes a small beginning in a great change in the field of higher education making it more meaningful and diversified. Through this experiment, we seek " +
                    "to break new ground by bridging the gap between static university education and the social environment.",

            //daulat ram
            "Daulat Ram College (DRC) is one of the top constituent colleges of the prestigious University of Delhi. Founded by Educationist and Philantrophist Shri Daulat Ram Gupta in 1960, located in the North Campus. The college provides education at Bachelor's as well as Master's levels.Daulat Ram College has been awarded 'A' grade in the first cycle grading by the NAAC.",

            //dyal singh
            "Dyal Singh College is a co-educational institute of University of Delhi. It was established in 1959 and is situated in Delhi. It offers undergraduate as well as postgraduate courses in science, the humanities and commerce.\n" +
                    "\n" +
                    "It has been ranked 20th all over India in the national institutional ranking framework in 2019. Dyal Singh college has been awarded \"A\" grade by the National assessment and accreditation council in the year 2017. The college admits students from all communities irrespective of gender, caste, religion and physical challenges.",

            //dyalsingh eve
            "Dyal Singh College is a co-educational institute of University of Delhi. It was established in 1959 and is situated in Delhi. It offers undergraduate as well as postgraduate courses in science, the humanities and commerce.\n" +
                    "\n" +
                    "It has been ranked 20th all over India in the national institutional ranking framework in 2019. Dyal Singh college has been awarded \"A\" grade by the National assessment and accreditation council in the year 2017. The college admits students from all communities irrespective of gender, caste, religion and physical challenges. ",


    //ddu
            "Deen Dayal Upadhyaya College (informally known as DDUC) is one of the top constituent colleges of the University of Delhi in India, located at Phase 1, Dwarka Sector-3, Dwarka, New Delhi, Delhi 110078. It is fully funded by Government of Delhi. It was established on August 1990 in the memory of Deen Dayal Upadhyaya, a renowned philosopher, thinker and social worker.",



            //dcoaac
            "Delhi College of Arts and Commerce (DCAC), a premier institution of higher learning, is a constituent college of the Delhi University, financed partially (5 percent) by the Govt. of NCT, Delhi. It is a co-educational institution situated in prime location of Netaji Nagar, with various prominent residential societies and commercial ventures in its proximate neighbourhood. It is well connected by the Delhi Metro, the nearest stations being INA and AIIMS, as well as by road transport, through both bus routes as well as auto rickshaws/ e-rickshaws from the nearest Metro/ bus station. With the proposed Metro stations of Bhikaji Cama Place and R.K. Puram likely to be operational soon, commuting to college would further be eased.\n" +
                    "\n" +
                    "The College was established in 1987 under the aegis of Delhi Administration once the erstwhile G.D. Salwan College closed its operation.\n Though it is now an entity independent of the Salwan Trust, yet in its formative years, it transformed out of the erstwhile G.D. Salwan College that was located in Rajinder Nagar. \n\nThe college presently operates in a building owned by the Department of Higher Education, GNCTD. \nDespite the infrastructural constraints posed due to a non permanent self owned building, DCAC has earned the distinction of being one of the most sought after colleges, not just in South Campus, but also Delhi University as a whole. DCAC was also the pioneer college in Delhi University to introduce a three year Honors Programme in Journalism in July-August 1989.",

            //deshbandhu
            "Deshbandhu College was established in 1953 by the Ministry of Rehabilitation, as a memorial to freedom fighter Deshbandhu Gupta.[2] The college made a humble beginning with just 72 students and courses like Prep (arts), Prep (Science) and Pre-medical. The college was transferred to Ministry of Education and was later taken over by University of Delhi.\n" +
                    "\n\n" +
                    "Today, Deshbandhu is a fully maintained constituent college of University of Delhi and has the distinction of being the oldest and the largest co-educational institute in South Delhi promoting arts, commerce and science courses. \nThe college offers eight post-graduate and 20 undergraduate courses in disciplines spanning languages, history, political science. economics, commerce and all the major branches of science and mathematics. It caters to over 2000 students.",


            //Dr. Bhimrao
            "Dr. Bhim Rao Ambedkar College came into existence in 1991 during the birth centenary year of Bharat Ratna Baba Saheb Bhim Rao Ambedkar. \nIt is a constituent college of the University of Delhi and is sponsored by Delhi Government to cater to the needs of higher education in trans-Yamuna area.\n\n It is a co-educational institution. The college launched four professional courses in the university, namely, BA(Hons) Business Economics, BA(Hons) Social Work, BA(Hons) Hindi Journalism and Mass Communication and BA(Hons) Applied Psychology.",

            //gargi
            "Gargi College is one of the top colleges affiliated to the University of Delhi. It was established in the year 1967 and offers education in Arts and Humanities, Commerce, Science and Education for women." +
                    "\n\n" +
                    "Gargi has been ranked 9th among Art colleges of India according to the India Today Survey,and 7th in the Department of Sciences.",

            //hansraj
            "Hansraj College is a constituent college of the University of Delhi, in New Delhi, India. It is NAAC Grade A+ with CGPA 3.62.\n The college offers studies in Science, Liberal Arts, and Commerce. Since its foundation in 1948, the college has produced notable alumni who are prominent leaders in their fields nationally and internationally. \n\nIt is the first college of Delhi University and the first Central University college to hoist a Monumental National Flag in its premises, which was initiated by Flag Foundation Of India(NGO). The flag was hoisted on 25 January 2017, by Hansraj Alumnus and Founder of Flag Foundation Of India, Mr Naveen Jindal.",

            //Hindu college
            "Hindu College is now a constituent college of the University of Delhi in Delhi, India. Established in 1899 initially, at Kinari Bazar (Chandni Chowk), later shifted to Kashmiri Gate and then to its present site in Delhi University (North Campus). \nIt is widely regarded as one of the oldest and most prestigious colleges for arts and sciences in India. It offers undergraduate and postgraduate programmes in sciences, humanities, social sciences and commerce.\n" +
                    "\n" +
                    "Nationally, it is ranked 2nd in 2019 by National Institute Ranking Framework (NIRF) under Ministry of Human Resource Development (Government of India).\n\n It is awarded 'Star College' status for its Department of Biotechnology by the Ministry of Science and Technology (Government of India).",

            //Indiragandhi
            "Indira Gandhi Institute of Physical Education and Sports Sciences (IGIPESS) is one of the leading institution that also houses the Department of Physical Education & Sports Sciences under the Faculty of Inter-Disciplinary and Applied Sciences , University of Delhi offering all the categories of teacher training courses in physical education.\n" +
                    "\n\n" +
                    "The institute was established on 3rd August, 1987 by the Delhi Administration under the auspices of the University of Delhi. The institute is named after Late Mrs. Indira Gandhi , the first lady Prime Minister of India. At the instance of University Grants Commission and based on professional advice of institutions like :\n" +
                    "Lakshmibai National Institute of Physical Education (Gwalior),\n" +
                    "Netaji Subhash Institute of Sports (Patiala) , and\n" +
                    "Central Health Education Bureau (Delhi) ,\n\n" +
                    "A three year degree course viz. B.Sc. (Physical Education , Health Education and Sports) was started in the institute in 1987. It also now offers B.P.Ed. (Bachelor of Physical Education, One year) and M.P.Ed. (Master of Physical Education, Two year) courses recognized by National Council of Teacher Education (N.C.T.E.). \nThe institute has well-qualified staff , adequately staff , adequately equipped laboratories and rich library with latest books and research journals.",

            //INdraprastha
            "Indraprastha College for Women also known as Indraprastha College or IP College is the oldest women's college in Delhi. Established in 1924, it is affiliated to University of Delhi.\n" +
                    "\n\n" +
                    "The college offers graduate and post-graduate courses in Economics, Liberal Arts, Commerce, Literature, Computer Science, Multimedia Media & Mass Communication etc., and is among the prestigious colleges of India.",

            //institue of home economics
            "The Institute of Home Economics was founded in 1961, by Dr. (Mrs.) S. Malhan, the founder Director, to give women wider educational and professional avenues. The Institute became a leading centre for women’s education in the country.\n" +
                    "\n" +
                    "The Institute became a constituent college of the University of Delhi in 1969. Since then, the college has expanded. Though it was started as a Home Science college, it has expanded and offers a three-year undergraduate course in Microbiology as well as a four-year integrated course in Elementary education. \n\nFrom the current academic year, the college is offering the three-year B.Sc. (Hons) course in Biochemistry. The Institute originally only offered a two-year Diploma course in Home Science, but then offered regular degree courses at the undergraduate and post-graduate level, a post-graduate diploma course in addition to Ph.D. programmes.",

            //jankidevi
            "The college was founded in 1959 by the famous Gandhian Shri Brij Krishan Chandiwala in memory of his mother Smt. Janki Devi in order to promote women's education. \n\nIn recognition of the changing global scenario the college has changed its priorities and perspectives which is amply reflected in the syllabi and curriculam.",


            //
            "Jesus and Mary College (JMC) is a women-only college affiliated with the University of Delhi located in New Delhi, India.\nThe college awards bachelor's degrees in commerce, arts and mathematics. The college offers honors degrees in elementary education, history, sociology, political science,Vocational studies, Hindi, English, economics, psychology, math and commerce. The college is located in the Chanakyapuri diplomatic enclave in New Delhi.\n" +
                    "\n" +
                    "The college was founded by Religious of Jesus and Mary, a Roman Catholic congregation founded by St. Claudine Thevenet or known as Mary of St. Ignatius (1774–1837) in Lyon, France in 1818. \nThe Convent of Jesus and Mary, Delhi was established in 1919, and thereafter a college for women in Delhi and the college was founded in July 1968. At the time of opening, the college offered only two degrees: English (Hons.) and BA (Pass), but quickly expanded to offer degrees in other subjects.",

            //kalindi
            "The College has come a long way since its inception in 1967 and is now seen as a destination where students can embrace their future with hope and confidence. \n\nYears of hard work put in by all stakeholders show us the way forward. As a constituent college of University of Delhi, Kalindi College strives to cater to higher education to young women with a vision of a new, fulfilling future for all.\n A nourishing environment supported by a combination of competent infrastructure and a dedicated teaching faculty helps our students to achieve the highest accolades in Academics, Sports and other Extra-Curricular Activities.\n" +
                    "The college had a humble beginning as ‘Government College Devnagar’; within a year the college was shifted to the present location, again a Government School building, in East Patel Nagar.",

            //kamala nehru
            "Kamala Nehru College is located at the August Kranti Marg, New Delhi. It was established in the year 1964 and is affiliated to University of Delhi.\nIn 2017, the college ranked 16th in arts colleges and was also rated under top 28 commerce colleges in India by India Today.\nIn 2017 it was awarded an \"A grade\" by NAAC.",

            //keshav maha
            "Keshav Mahavidyalaya (Hindi: केशव महाविद्यालय), also known as KMV/Keshav College, is one of the colleges of Delhi University outside the North and South campuses, in the northwest residential area of Pitam Pura.\n" +
                    "\n" +
                    "Keshav Mahavidyalaya was established by the Government of Delhi in August 1994. When the college was established, its campus was a school building in the northwest residential area of Keshav Puram. \nThe college admits only undergraduates and awards degrees under the purview of the University of Delhi.",

            //kirorimal
            "Kirori Mal College is one of the constituent college of the University of Delhi, located in the North Campus of DU, in New Delhi, India. Established in 1954. National Assessment and Accreditation Council accredited it with a CGPA of 3.54(A+) in 2016, which is third highest among all Delhi University colleges.",

            //Lady irwin
            "Lady Irwin College is a constituent college of the University of Delhi. Established in 1932, it is women's college and located in New Delhi, India, and offers graduate courses in Food Technology as well as graduate and post-graduate courses in Home Science.",

            //Lady Shriram college
            "Lady Shri Ram College for Women, has long been recognized as a premier institution of higher learning for women in India. A centre for academic excellence and achievement, it is today one of the finest institutions for Social Sciences, Humanities and Commerce, while also offering a B.Sc. Programme in Statistics. Professional courses like Elementary Education and Journalism are among its strengths. \n\nLocated at the cutting edge of knowledge, LSR has not just kept pace with the changing world, but has been the pioneering spirit behind many innovations in the field of education. \nThe striving is to imbue the teaching/learning process with a unique blend of intellectual rigour and aesthetic and ethical engagement.",

            //Lakshmibai college
            "Lakshmibai College is a constituent college of the University of Delhi and is well-connected through several metro stations and bus-routes. \nThe college is proud of its red-brick buildings, lawns adorned with trees and flowers, well-maintained sports grounds, staff-quarters, wireless Internet access under the University Wide Networking Programme, separate Internet connectivity, supplementary audio-video gadgets, two air conditioned lecture theatres, a furnished seminar room, a modern fully automated library using Libsys software, two well-equipped computer labs and an active placement cell. \nThe library has undergone renovation and now has its own computer unit catering to the students and teaching faculty. The library is fully automated and is endowed with OPAC and scanner-guns for greater efficiency. \n\nThe college is inclusive in its intent and actions , therefore SAFA is loaded on the systems of the computer lab for differently-abled students to help them learn typing skills. Wi-Fi connectivity has also been provided to the lab.",

            //Maharaja agrasena
            "Maharaja Agrasen College was established in 1994 with the objective of catering to the educational requirements of a densely populated East Delhi. The college is fully funded by the Government of India. \nThe college has now shifted to its modern and spacious building complex covering 10 acres (40,000 m2) in Vasundhara Enclave, Delhi. It includes an auditorium, a computer centre, fully computerized library, laboratories, and a conference hall. \n\nThe new building complex has acquired several new facilities like an Information and Communication Technology Center, a Language Laboratory, a Media Laboratory, an Indira Gandhi Open University Center, and a University Grants Commission Research Center among others. The college also provides residential facilities for girl students.",

            //maharishi
            "Maharshi Valmiki College of Education was established in the year 1995 by the Govt of NCT of Delhi as a Constituent College of University of Delhi to cater to the long standing need for providing avenues for pre-service elementary and secondary teacher education programmes for the aspiring students in Delhi. \n\nInitially known as College of Education and housed on the Ground Floor of Bhai Parmanand Institute of Business Studies Building, Shakarpur, Delhi the college assumed its present name, Maharshi Valmiki College of Education, later in the year 1997 drawing inspiration from the high ideals of the great teacher Valmiki.",

            //maitreyi
            "Maitreyi College is a college in the South Campus of the University of Delhi, located in Bapu Dham, Chanakyapuri, New Delhi-110021, India. It was established in July 1967 and named after the Vedic sage Maitreyi. An All-women's college, it offers various courses in the fields of Science, Arts and Commerce. \n\nThe college was recognised by DBT as a star college, conferring the star status to all four of its science departments namely Botany, Zoology, Chemistry and Mathematics.",

           //mata sundri
            "Mata Sundri College for Women also shortly known as Mata Sundari College is a constituent college of University of Delhi. The college was founded in 1967 by Delhi Sikhs Gurudwara Management Committee. \n\nAt present 3737 students are enrolled in various Certificate, Diploma, undergraduate and Postgraduate courses available in the college. The college is located in the central Delhi and comes under the jurisdiction of the North Campus of University of Delhi.",

            //Miranda House
            "Miranda House was founded in 1948 by the university vice-chancellor, Sir Maurice Gwyer.\nIts foundation stone was laid by Lady Edwina Mountbatten on 7 March in the same year. Miranda House is built of red bricks on the university campus. \n\nIts original design was planned by the architect Walter Sykes George and is architecturally similar to other educational institutions in India founded in the colonial era. As the college grew, several buildings were added.",

            //motilal
            "Motilal Nehru College (MLNC) is one of the largest constituent colleges of the University of Delhi.\nIt awards degrees under the purview of the university and offers courses in science, humanities and commerce disciplines at the undergraduate level. \n\nThere is also an evening college operating in the same campus premises called Motilal Nehru College Evening.",

            //motilaleve
            "Motilal Nehru College (Evening) established in July, 1965, is a constituent college of the University of Delhi. It is situated on Benito Juarez Marg, adjacent to the South Campus of the University of Delhi. Apart from imparting education in various courses of study the college emphasizes character-building of the students and inculcates the values of responsible citizenship in them. \n\nThe Various College student societies/ associations, play a vital role in the academic life of the institution These active departmental associations organize lectures, seminars and discussions for the benefit of student and teachers alike.",

            //pgdav
            "P.G.D.A.V. College was started in a modest way on 17 August 1957 by the D.A.V College Managing Committee. Progressing gradually in 1971, the college shifted to its own premises at a location between Lajpat Nagar and Ashram on the main ring road. It has two sessions of classes, in morning and evening.",

            //pgdav eve
            "P.G.D.A.V. College was started in a modest way on 17 August 1957 by the D.A.V College Managing Committee. Progressing gradually in 1971, the college shifted to its own premises at a location between Lajpat Nagar and Ashram on the main ring road. It has two sessions of classes, in morning and evening.",

            //rajdhani
            "Rajdhani College is a constituent College of the University of Delhi. It was established in 1964 by the Delhi Administration under the name of Government College. \nThe College acquired its new name when the Delhi Administration vested its governance in an autonomous governing body. Rajdhani College is West Campus College\n" +
                    "\n" +
                    "The College is situated on Mahatma Gandhi Marg (Ring Road), near the posh area of Rajouri Garden and Raja Garden in west Delhi. Its new building was constructed in 1976-77. \nThe College complex has an air conditioned seminar room, an auditorium, a library, laboratories, and playgrounds for cricket, football, hockey and volleyball.",

            //ram lal ananda
            "Ram Lal Anand College (RLA) (Hindi:रामलाल आनंद कॉलेज) is located in New Delhi, India. It has been one of the University of Delhi's maintained colleges of since 1973. It awards degrees under the purview of the university and offers courses at the undergraduate level. \n\nThe college is situated next to Moti Lal Nehru college in the south campus. \nIt is a co-educational college that admits students and select teachers from all communities irrespective of gender, caste, religion and physical challenges.",

            //ramanunjan
            "Ramanujan College is one of the constituent colleges of University of Delhi. \n\nIt was previously known as Deshbandhu Evening College and functioned in the evening hours at the same building of Deshbandhu College. It has approximately 1700 students studying various bachelor's courses in the disciplines of arts, commerce and science.",

            //ramjas
            "Ramjas College is a college of the University of Delhi located in North Campus of the university in New Delhi, India. It is one of the first three colleges established under University of Delhi and is one of the best colleges in the country. \n\nThe college admits both undergraduates and post-graduates, and awards degrees under the purview of the University of Delhi. Ramjas was celebrating its Centennial legacy from 2016 and completed its 100 years celebration in January 2017.",

            //satyawati college
            "Satyawati College is a university college in Delhi, India, affiliated to the University of Delhi.\n It offers both morning and evening classes to a student base of almost 2,400, with a permanent teaching staff of around 150.The college was established in 1972 by the Government of Delhi.",

            //satyawati eve
            "Satyawati College is a university college in Delhi, India, affiliated to the University of Delhi.\\n It offers both morning and evening classes to a student base of almost 2,400, with a permanent teaching staff of around 150.The college was established in 1973 by the Government of Delhi",

            //shaheed bhagat singh
            "Shaheed Bhagat Singh College is a co-educational institute which was established in 1967. It is a constituent college of the University of Delhi. \nThe college is named after Shaheed Bhagat Singh, an Indian freedom fighter who believed strongly in social justice. The college is famous for its Departments of Commerce and Economics.\n\nThe college is ranked amongst the top colleges for commerce in the country. It has been accredited with A Grade with 3.26 NAAC.",

            //shaheed bhagat singh eve
            "Shaheed Bhagat Singh College is a co-educational institute which was established in 1967. It is a constituent college of the University of Delhi. \nThe college is named after Shaheed Bhagat Singh, an Indian freedom fighter who believed strongly in social justice. The college is famous for its Departments of Commerce and Economics.\n\nThe college is ranked amongst the top colleges for commerce in the country. It has been accredited with A Grade with 3.26 NAAC.",

            //shaheed rajguru
            "The University of Delhi, informally known as Delhi University (DU), is a collegiate public central university, located in New Delhi, India. \nIt was founded in 1922 by an Act of the Central Legislative Assembly. As a collegiate university, its main functions are divided between the academic departments of the university and affiliated colleges. \n\nConsisting of three colleges, two faculties, and 750 students at its founding, the University of Delhi has since become India's largest institution of higher learning and among the largest in the world. The university currently consists of 16 faculties and 86 departments distributed across its North and South campuses. It has 77 affiliated colleges and 5 other institutes with an enrollment of over 132,000 regular students and 261,000 non-formal students. The Vice-President of India serves as the University's chancellor.",

            //shaheed sukhdev college
            "Shaheed Sukhdev College is a top college of the University of Delhi falling under the Faculty of Management Studies, imparting education in the fields of management, finance and information technology. \nThe college was established in 1987 by the Ministry of Human Resource Development as the first collegiate business college in India. \n\nThe college has rapidly developed since its inauguration, and has been consistently ranked as one of the best colleges in off campus.",

            //shivaji college
            "Shivaji College is a constituent college of the University of Delhi. It is a co-educational institution established in 1961 and imparts instruction in various subjects at both undergraduate and postgraduate levels.\n" +
                    "\n" +
                    "Over the years, several students of the college have excelled in the academic field by obtaining top or near-top positions in various university examinations. The results of the college in general have been consistently good.\n" +
                    "\n" +
                    "The college has extensive playgrounds which provide an excellent opportunity to students to participate in various games and sports. \n\nAs in the academic field, on the sports field the college also has many an achievement to its credit.\n\nThe college has various societies dedicated to art, literature, dance, debate, music, and most especially theatre. The theatre society of Shivaji College, named VAYAM, is one of the top college theatre societies of India.",


            //Shri ram coll
            "Commerce education in India began in 1886 with the establishment of a commercial school in Chennai (erstwhile Madras). Shri Ram College of Commerce embarked on its voyage early in the year 1920 when on the day of Basant Panchmi, seven leading businessmen in Delhi established the Commercial Education Trust. \nThe Trust set up its first school in the same year under the name 'The Commercial School' at Charkhewalan in the walled city of pre-independence Delhi. \n\nThe school introduced a Post-Matriculation Diploma Programme in Commerce under the supervision of Mr. R.K. Kumar, who later became the first Principal of the Commercial College. The inauguration of the Commercial College paved the entry of commerce education in the University system of Delhi.",
            //shyam lal
            "Shyam Lal College (SLC), a co-educational constituent college of the University of Delhi, was established in 1964 by the great visionary and entrepreneur Padmashree (late) Shri Shyam Lal Gupta, the then Chairman of Shyam Lal charitable trust. The foundation stone of the college was laid down by Dr. Zakir Hussain, the then Hon'ble Vice President of India and Chancellor of the University of Delhi. \n\nThe aim of the college, at the time of inception, was to make quality education accessible to the students, especially girls, from the economically and educationally disadvantaged community of East Delhi. Since its establishment in 1964, SLC has come a long way and has become a centre of academic excellence in University of Delhi.",

            //shyam lal eve
            "Shyam Lal College was founded by Late Padma Shree Shyam Lal Gupta, Chairman, Shyam Lal Charitable Trust in the year 1964. The foundation stone of the College was laid by Late Dr. Zakir Hussain, the then Hon’ble Vice President of India and Chancellor of University of Delhi on May 24, 1964.\n" +
                    "\n" +
                    "The Evening College started functioning from September 8, 1969. Since its inception, it is one of the full-fledged constituent colleges of University of Delhi imparting knowledge in Commerce and Humanities to more than 1500 students every year. The College has been in the news for its various academic and co-curricular activities like academic achievements of Students and Teachers, Innovation Projects, Flower Show, Sports, Eco-Club, NCC, NSS and Gandhi Study Circle.",


            //sri aurobindo
            "Sri Aurobindo College was established in 1972, the birth centenary of the philosopher, patriot-poet, Sri Aurobindo, as a constituent college of the University of Delhi. The College inculcates the ideals of Sri Aurobindo and believes that an active commitment towards excellence is fundamental to the process of education.\n" +
                    "\n" +
                    "The College, popularly referred to as \"Aurobindo\", offers liberal education in humanities, commerce and science to more than 3200 students. It offers B. A. Honours in English, Hindi and Political Science, B.A. Programme, B.Com.(H) and B.Com., B.Sc. Honours Electronics, B.Sc. Programme Life Sciences and Physical Sciences.\n" +
                    "\n" +
                    "Besides catering to students from Delhi, particularly South Delhi, a large number of students come from diverse parts of the country including Bihar, UP and North Eastern India.",


            //sri aurobindo eve
            "Sri Aurobindo College (Evening) established in 1984 is a constituent College of the University of Delhi. The College has completed 32 years that charter all the phases of its growth and success. Each year of this period can be seen as a milestone in the history of this young institution. Since 1988 the college opened its doors to women students too. \n" +
                    "\nThe College began by offering instructions in B.A. (Prog.) and B.Com. (Prog.) Courses. Over the years courses in B.Com. (Honours), B.A. (Honours) Hindi, B.A. (Honours) Applied Psychology were introduced. From the Academic Session 2013-14 the new Four Year Under Graduate Program (FYUP) was introduced and all B.A. (Prog.) and B.Com. (Prog.) courses were discontinued. Under FYUP new Honours Courses in English & Economics, and B.Tech. in Psychological Science were introduced in the College. \n" +
                    "\n\nThe Three Year Undergraduate Program has been reintroduced in the academic session year 2014-15 and the FYUP has been discontinued. The College presently offers the following courses in 1st. year: B.Com. (Hons.), B.Com., B.A. (Hons.) Applied Psychology, B.A. (Hons.) Hindi and B.A. (Prog.). From the year 2015-2016 the choice based programme (CBCS) has been introduced. ",

            //sri gurugobind singh
            "Sri Guru Gobind Singh College of Commerce (SGGSCC) is a college of the University of Delhi located in Delhi, India. It was founded in 1984 and is named after the tenth Sikh Guru. It is the second college of commerce of the University of Delhi. The college has been ranked 5th in all of delhi university for commerce courses .The college is primarily a co-educational English medium institution.It is often known for its cosmopolitan crowd and consistently rising cutoffs. In 2016 its cutoff touched as high as 97.25%\n" +
                    "\n" +
                    "The university runs undergraduate and post-graduate degrees in commerce fields. It is ranked top among all other colleges offering Business Economics.\n" +
                    "\n" +
                    "As of 2015, the college has some 1700-2000 students. The Principal is Dr J. B. Singh and the staff are almost exclusively Delhi University graduates themselves.",

            //sri guru nank dev
            "Sri Guru Nanak Dev Khalsa College is a constituent college of University of Delhi which offers courses in Commerce and Humanities at undergraduate and postgraduate levels. \nThe College was established in 1973 and is named after first Guru of the Sikhs and functions under the able management of Delhi Sikh Gurudwara Management Committee. \n\nThe college has been granted minority status by the National Commission for Minority Education institutions. The College is located in Guru Ravi Das Marg, Block 4, Dev Nagar, Karol Bagh, New Delhi, Delhi 110005.",

            //sri guru teg bahadur
            "Sri Guru Tegh Bahadur Khalsa College is a constituent college of the University of Delhi. Established in 1951, it is one of the oldest and most prestigious institutes for science, commerce and arts in India. In 2017, the highest admission cut-off was 99.66 per cent for B.Sc (Hons) in Electronics in SGTB Khalsa College. In the humanities stream, Khalsa College had set the highest cut-off at 99 per cent for BA (Hons) in Political Science.\n" +
                    "\n" +
                    "The college has 59 classrooms, 19 labs, 6 research labs, indoor and outdoor sports facilities, gymnasium, cafeteria, bank, and medical facilities in proximity, besides other utility services such as post-office and market. \nThe college is well connected by road and Delhi Metro link, and majority students are day-scholars. \nA hostel for girls can accommodate 147 students, and a hostel for boys is planned to come up soon.",

            //sri venkateshwara
            "Sri Venkateswara College is a co-ed constituent college of the University of Delhi established in 1962 in New Delhi, India. \n\nIt is being administered by Tirumala Tirupati Devasthanams and awards degrees under the purview of the university and offers courses both at the undergraduate level and the postgraduate level. Vocational courses and short-term add-on courses that serve as significant supplements to the academic profiles of the students are offered. \nIt is a national level college and not a minority college; there are no reservations for any religious or linguistic minority as well.",

            //st. stephens college
            "St. Stephen's College is a constituent college of the University of Delhi. Widely regarded as one of the oldest and most prestigious colleges for arts and sciences in India, the institution has produced a line of distinguished alumni. It was established by the Cambridge Mission to Delhi. \n\nThe college admits both undergraduates and post-graduates, and awards degrees in liberal arts and sciences under the purview of the University of Delhi. As of 2017, the Governing Body of the College has unilaterally initiated a move towards making it an autonomous institution.",

            //swami shradhdhananda
            "Swami Shraddhanand College is a part of Delhi University established in 1967, run under the trusteeship of the Delhi government. Named after Arya Samaj educationist, Swami Shraddhanand, the college is in Alipur, in North West Delhi. The college is one of the premier institutions of Delhi University. \nIt is equipped with qualified teaching staff specialized laboratories and adequate library facilities.",

            //vivekananda college
            "The foundation stone of the College building was laid on 26th Oct. 1976 by Prof. S. Nurul Hassan and the building was dedicated by Swami Ranganathananda of the Ramakrishna Mission in 1979. The college started in a school building with approximately 300 students admitted to B.A. (Pass). \n\nSince then the college has witnessed a meteoric rise in the number of students seeking admission in the different courses offered by it. \nIt is one of the most sought after college in the Trans-Yamuna area for women education.",

            //zakire
            "The origin of the Zakir Husain Delhi College can be traced to the closing years of the 17th Century, with the founding of a Madrasa by Ghaziuddin Khan, one of the Emperor Aurangzeb’s leading Deccan commanders and the father of the first Nizam of Hyderabad. The complex containing his tomb, a mosque and a Madrasa, can be visited today outside the Ajmeri Gate near the Dargah of the 13th century Sufi, Hazrat Hafiz Sadullah.\n" +
                    "\n" +
                    "The upheavals that weakened the Mughal empire during the 18th century, resulted in the closure of the Madrasa in the early 1790’s, but, with the support of the wealthy citizens of Delhi, an oriental college for literature, science and art, was established at the site in 1792. Instruction was provided in prose, literature, rhetoric, logic, philosophy, jurisprudence, astrology and medicine.",

            //zakir eve
            "Dr. Zakir Husain, after whom this college is named, was the President of India from 1967 to 1969. He was a freedom fighter and an eminent educationist who was closely associated with Mahatma Gandhi. He chaired the Committee to formulate the scheme of basic education following the Wardha Educational Conference in 1937. He was also an acclaimed author and was awarded the highest national honour - Bharat Ratna - in 1963.\n" +
                    "\n" +
                    "Zakir Husain College is the oldest College of Delhi. It was established as a Madarsah by Ghaziuddin Firoz Jung in 1780 outside Ajmeri Gate. It later developed into Delhi College in 1825 when it was popularly known as \"Dilli College\". During the middle of the 19th Century, due to political upheavals like the Great Uprising of 1857, it had to be shut down. It was reopened and was shifted to Kashmiri Gate in the building where presently the offices of the Indraprastha University are located.",



    };


    String[] courseintro = {

            //acharya
            "The college offers B.Sc. (Hons.) program in eight specializations viz., Biomedical Sciences, " +
                    "Botany, Chemistry, Computer Science, Electronics, Mathematics, Physics and Zoology, " +
                    "B.Sc. (Regular) program in two specializations -  Life Sciences and Physicals Science " +
                    "and B.Com. (Regular/ Hons.) at the Undergraduate level. Selection to the programs is " +
                    "done on the basis of marks obtained in the qualifying examination.\n" +
                    "\n" +
                    "For B.Sc. (Hons.) a candidate must have passed 10+2 or equivalent from a recognized " +
                    "board with Physics, Chemistry/Computer Science, Mathematics and/or Biology as " +
                    "compulsory subjects.\n" +
                    "\n" +
                    "For B.Com. (Hons.) candidates should have secured minimum 60% in 12th with Mathematics" +
                    " or Business Mathematics as mandatory subjects.",
            //aditi
            "The college runs some certificate level short term courses also under the guidelines of YWCA " +
                    "It has been a hundred years since the YWCA of Delhi has established itself firmly on " +
                    "the social sector map alongside other great institutions.",


            //aryabhatta
            "The College offers Undergraduate courses in various streams of Arts, Commerce, Science, " +
                    "Foreign Languages and Vocational Studies. The University offers twenty-six " +
                    "specializations in B.A.(Hons.) program, twenty specializations in B.Sc.(Hons.) " +
                    "program and One specialization in B.Com (Hons.)\n" +
                    "\n\n" +
                    "Aryabhatta College Undergraduate Admission\n\n" +
                    "Admission to the UG program is on the basis of marks acquired by the candidate " +
                    "in 12th or equivalent from a recognized board with minimum 45% marks in the relevant" +
                    " streams. Selection will be on the basis of the Cut Off list that will be given " +
                    "by Delhi University.",
            //atmaram
           " There is a very active Placement Cell in the college which provides an equal amount of " +
                   "employment opportunities to every student. The cell provides guidance, mentorship, " +
                   "and necessary skill sets to the students. Also, it organizes workshops, seminars" +
                   " and motivational talks by eminent speakers. Reputed Companies associated with the " +
                   "college includes IndiGo, ICICI Bank, NIIT, Clairvolex, KPMG and many more.\n",

            //Bhagini
            "Candidates belonging to scheduled caste/tribes are awarded scholarship by the state to which " +
                    "they belong. Such students are advised to obtain application forms from the Accounts " +
                    "Section immediately after their admission and submit the same duly completed along with required " +
                    "certificates before the last date announced each year",

            //bharti
            "The College also offers part-time, self-financing courses in foreign languages (French, German and Russian) as well as " +
                    "computer courses to prepare students for the world of work. These courses run in the afternoons after regular " +
                    "classes are over, or in the early morning, before regular classes begin, and are manned by " +
                    "highly trained personnel and place great emphasis on practical training and hands-on instructions. A " +
                    "separate prospectus provides further details.",

            //dca
            "At the undergraduate level, the college offers full-time four year Bachelors in Fine Arts degree to the students every year. Minimum required eligibility is the candidate should have scored at least 50% aggregate in Senior School Certification Examination. 5% concession in the minimum required marks is given to reserved candidates such as OBC/SC/ST candidates, widows, children of armed personnel and students with disabilities.\n" +
                    "\n\n" +
                    "Students passing Pre-University (2 years) examination of Indian board recognized by the University of Delhi are also eligible for admission to BFA course. Final selection of the candidate is done on the basis of qualifying examination scores and marks obtained in the aptitude test, conducted by the university. The weightage for selection is as follows:\n" +
                    "\n" +
                    "\n60% weightage is given for marks obtained in the qualifying aptitude examination\n" +
                    "\n40% weightage is given for marks obtained in the HSC examination\n" +
                    "\nOnly the candidates securing 50% or more marks in the Aptitude Test will be considered for admission.\n" +
                    "\n\n For Hearing and Speech impaired students, a Diploma course in Fine Art is offered by the institute with one seat in each of the five specializations. The students who have passed the Secondary School Certificate (Class-X) or an examination equivalent will be eligible for admission to this Course subject to their passing the Aptitude Test only in practical subjects.",

            //cvs
            "The College offers professional honours courses like B.A. (Hons.) Business Economics (BBE), and Bachelor of Management Studies (BMS). The college also has regular honours courses like B.Com. (Hons.), " +
                    "B.A. (Hons.) Economics, B.A. (Hons.) History, B.Sc. (Hons.) Computer Science, and recently " +
                    "introduced B.A. (Hons.) Hindi and reintroduced B.A. (Hons.) English and Bachelor of Management Studies from 2017 session.",

            //daulat ram
            "College has a placement cell which offers various internship programmes. The internships are majorly unpaid. Companies like ICICI Bank, KPMG, Deloitte, etc., visit the campus for recruitment. Recently, Deloitte has visited the college to recruit intellectual personnel.",


            //dyalsingh
            " ",

            //dyalsingh eve
            " The college has an active placement cell which provides great job opportunities to the students. Reputed companies like KPMG India, Wipro, TCL, and Tech Mahindra visited our college to offer placements to the final year students. The average salary package offered ranged from 3 LPA to 6 LPA, which is decent.",

            //ddu
            "In order to cater to business and management education at the undergraduate level, a three-year Bachelor of Business Studies was inaugurated on 18 July 2007. This unique course being offered in only three colleges of the University for Delhi, follows a National Level entrance test, for which more than 25,000 students appear, who undergo a rigorous process of selection including Group Discussion followed by a personal interview, of which very few are selected.",



            };


    String[] collnames = {
            "Acharya Narendra Dev College",
            "Aditi Mahavidyalaya",
            "Aryabhatta College",
            "Atma Ram Sanatan Dharma College",
            "Bhagini Nivedita College",
            "Bharati College",
            "Bhaskaracharya College Of Applied Sciences",
            "College Of Arts",
            "College of Vocational Studies",
            "Daulat Ram College",
            "Dyal Singh College",
            "Dyal Singh College(evening)",
            "Deen Dayal Upadhyaya College",
            "Delhi College Of Arts & Commerce",
            "Deshbandhu College",
            "Dr. Bhim Rao Ambedkar College",
            "Gargi College",
            "Hansraj College",
            "Hindu College",
            "Indira Gandhi Institute of Physical Education and Sports Sciences",
            "Indraprastha College for women",
            "Insitute Of Home Economics",
            "Janki Devi Memorial College",
            "Jesus and Mary College",
            "Kalindi College",
            "Kamala Nehru College",
            "Keshav Mahavidyalaya College",
            "Kirori Mal College",
            "Lady Irwin College",
            "Lady Shri Ram College for women",
            "Lakshimbai College",
            "Maharaja Agrasena College",
            "Maharishi Valmiki College of Education",
            "Maitreyi College",
            "Mata Sundri College for Women",
            "Miranda House",
            "Motilal Nehru College",
            "Motilal Nehru College(evening)",
            "P.G.D.A.V",
            "P.G.D.A.V College(evening)",
            "Rajdhani College",
            "Ram Lal Ananda College",
            "Ramanujan College",
            "Ramjas College",
            "Satyawati College",
            "Satyawati College(evening)",
            "Shaheed Bhagat Singh College",
            "Shahhed Bhagat Singh College(evening)",
            "Shaheed Rajguru College Of Applied Sciences",
            "Shaheed Sukhdev College Of Business Studies",
            "Shivaji College",
            "Shri Ram College Of Commerce",
            "Shyama Lal College",
            "Shyama Lal College(evening)",
            "Sri Aurobindo College",
            "Sri Aurobindo College(evening)",
            "Sri Guru Gobind Singh College Of Commerce",
            "Sri Guru Nanak Dev Khalsa College",
            "Sri Guru Teg Bahadur Khalsa College",
            "Sri Venkateswara College",
            "St. Stephen's College",
            "Swami Shraddhanada College",
            "Vivekananda College",
            "Zakir Hussain Delhi College",
            "Zakir Hussain Delhi College(evening)"};


    String[] broch = {
            "https://drive.google.com/open?id=11NU1p3DobT1JwAHYpA6BgFrZNnvxVs-z",
            "https://drive.google.com/open?id=1JsLEwmnJUrj4OraoEwv3vom_tV-gyJnX",
            "https://drive.google.com/open?id=1CFCkaahm-gcI6m5kMJKyuPRx82fFfqZ0",
            "https://drive.google.com/open?id=1wBq2HgLrTPOiSiEwkH-n2w564ZljtLU1",
            "https://drive.google.com/open?id=1Ng2R9v3bAhE4lyrFH8aYjV9-BEc0-gGa",
            "https://drive.google.com/open?id=15CjoDgK2Pz4BcKW8z7EKKYJAC-D4CSQv",
            "https://drive.google.com/open?id=1EQeHUAbHHV__EejbfBPmhwC9rG_QkzRp",
            "https://drive.google.com/open?id=1qLSYfmxPExW5d3-i1HsAHLEmixJSztsW",
            "https://drive.google.com/open?id=16DfIo5nS2F8G3KEUtsXxImruln9TLYGN",
            "https://drive.google.com/open?id=1m-t6u-Lv-mSQd4cCkatboT-0FKgJ7nB_",
            "https://drive.google.com/open?id=1opW4bmqVH1nQFFMnBZRrJoXOnumMNXjo",
            "https://drive.google.com/open?id=1NvptydgQhzuBnqRxM59hwd1eni1KCZih",
            "https://drive.google.com/open?id=1uI4TQK2jgw-tlc86U2Hb2IWl9OMtNz10",
            "https://drive.google.com/open?id=1n7fqGL5D3-tXW8Ar5bNpsKJEiGCLgf9b",
            "https://drive.google.com/open?id=1iVvP7mbiwRmNkuimyFp3mTLxQnxAgm9i",
            "https://drive.google.com/open?id=1lYAYymKXfpe5izmw2mXch4ih8m28kXxR",
            "https://drive.google.com/open?id=106RFvx0i99siznzvc-Cvf7aY0TSd-5FM",
            "https://drive.google.com/open?id=1sBLW1ezVZaTbFWaw_oBhAFg4v3MgUoBj",
            "https://drive.google.com/open?id=1GS_gDvd3j9Av87yllDAPmCOxJ-iYiwCe",
            "https://drive.google.com/open?id=1F7HrwJY6MpNVgiFgCBIN91xarS4VX2sM",
            "https://drive.google.com/open?id=1z7dZVW1F0VoZn6mm8iBirc9TuMdR1Ved",
            "https://drive.google.com/open?id=1qKI8ZiouYYay1ThU1WN-4GvrzZZuXX06",
            "https://drive.google.com/open?id=1AlKrIwnDYWyEHRuhyc24mfGav1ehP6UL",
            "https://drive.google.com/open?id=1TaciXe3TF10JWuJOrt-U89IVmh2gUfyc",
            "https://drive.google.com/open?id=1evu1n5JnLvM0MHqntaK_WbaIS3U52Sgs",
            "https://drive.google.com/open?id=1YDiSItrWRImW7tkFEbwFmPA7IpRDMjLm",
            "https://drive.google.com/open?id=1yQX4QdDHS46xS3nxoABxAQj4uRbqhJ-M",
            "https://drive.google.com/open?id=1O4DTEUh8g8_BGQNO-3VII1TxdQoF7n2S",
            "https://drive.google.com/open?id=16pl4dAh_zZkxw1kMKyzMSPcmQcY-kxpS",
            "https://drive.google.com/open?id=1ELSjh18bSv90dULND2If0C3PD9xEXRM7",
            "https://drive.google.com/open?id=1vBXGQHZG-2TcqDcFIu3ejzhPGuQ-ddfQ",
            "https://drive.google.com/open?id=1F0qW4irH2St1Z7_UjJpqyXWm9ACOM0HB",
            "https://drive.google.com/open?id=1qSFBpjSE4ApSXZUOZbq_31Wxxgvyqxsw",
            "https://drive.google.com/open?id=1MdqojvF9bM7TbA4CMHDU38jzbV_6AqhP",
            "https://drive.google.com/open?id=1zIatYDFxaiEIZaYjKxFHAt1OqsPVRqad",
            "https://drive.google.com/open?id=1rjZ86vxEXBcWGnJ5W1iTesbRJUFEOtfl",
            "https://drive.google.com/open?id=1wpfnBJYCnxlt2zrMXyIrBoesV3qlQLLS",
            "https://drive.google.com/open?id=1EsheJtNBNDPhbtNAMTPpu5qZDIMpeTb8",
            "https://drive.google.com/open?id=1GE1qVrXzuAJHmlTYN7tJwKJVMGMZ6VX_",
            "https://drive.google.com/open?id=1kvwuXIeBpb_yN_J26PEkq1BTqEZjigcL",
            "https://drive.google.com/open?id=19hzPvrB5u6EW-EYV7x9cVIkYyFPOuPmp",
            "https://drive.google.com/open?id=1y85klTAabE_FYQ82Thf070iJe9qzGiXy",
            "https://drive.google.com/open?id=1Stmpp9GudkZrgxYHNi98k4H_syFDXQoy",
            "https://drive.google.com/open?id=1oZHzFir_nKO2Mj613Vq594jMg8BAfmB9",
            "https://drive.google.com/open?id=1jl4lKsXuX9luUigmxSzm-vYeaAUEYAIy",
            "https://drive.google.com/open?id=1DUmvdvrT-Tn0o-h-2NOKOs-2erH6w0KY",
            "https://drive.google.com/open?id=1bw3XLCzEW1rAvvbAgK1mOn1STrghYW3d",
            "https://drive.google.com/open?id=13jWhrQAIeKUaJAWA5Z_F02_-6J1DU_dU",
            "https://drive.google.com/open?id=1a4eAiPOoIucDd0crPExc3oiHuWz33LI1",
            "https://drive.google.com/open?id=1WnGenTs28IW5xdMcrlXmr6O2K6ttIQMA",
            "https://drive.google.com/open?id=1UIdnTart_x008hh002DPRxqku5K0d9gj",
            "https://drive.google.com/open?id=1VmdP-WiNvGF5q3BqLAWBFotQoERu0HwL",
            "https://drive.google.com/open?id=1dqQ30lB7Vf9BBLTl07a7ElWc5L3CD_IQ",
            "https://drive.google.com/open?id=13KVxU173MG0j3qXU1p0S3LmzKn457LP0",
            "https://drive.google.com/open?id=171tWE_RTlTZz1YmgtaoctxMdwMI17LMx",
            "https://drive.google.com/open?id=1KQErrZRVrXUf6eOPHykRn123Hj_fLqAd",
            "https://drive.google.com/open?id=1fGdO3Ky0Eh3z4JGBbpUhbdYZah0jwUK-",
            "https://drive.google.com/open?id=1qsQArE3-ptAIpJrinUZgzVYuC5VQLjR1",
            "https://drive.google.com/open?id=1FnxodP9l3o2sLGP0yJaRgfdOp1QEiO0t",
            "https://drive.google.com/open?id=1kKfsEPoI5GfGBCcvSikuyLtEnjJD5fcB",
            "https://drive.google.com/open?id=1v2ZW3gYkSkAfnDvkupAIFPEXPXGnUNx1",
            "https://drive.google.com/open?id=1KltMp0bF5sbkGd6Udc-kgXq3IeN7M4e-",
            "https://drive.google.com/open?id=13HG6E0angbXSPXbo4KWbbVp9dYYgnb4h",
            "https://drive.google.com/open?id=1E1wKHrPbKCkqw_bc-onxnkxyhNxyoC_U",
            "https://drive.google.com/open?id=1Lcq3MI7vbIiEXY6BFZH7PYE4rlcPjf2P"};


    String[] colldesc = {
            "B.Com | B.Sc",
            "B.A | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.E | B.Com",
            "B.Sc",
            "B.F.A",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.P.Ed | B.Sc",
            "B.A | B.Sc | B.Com",
            "B.Sc",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc",
            "B.Sc",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.Ed",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc",
            "B.A",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Com",
            "B.A | B.Com",
            "B.A | B.Com",
            "B.Sc",
            "B.Sc",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Sc | B.Com",
            "B.A | B.Com",


    };


    String colcoursedetailed[] =
            {          //Acharya narendre college
                    "B.Sc.(H)Biomedical Sciences\n" +
                            "B.Sc.(H)Botany\n" +
                            "B.Sc.(H)Chemistry\n" +
                            "B.Sc.(H)Computer Science\n" +
                            "B.Sc.(H)Electronics\n" +
                            "B.Sc.(H)Physics\n" +
                            "B.Sc.(H)Zoology\n" +
                            "B.Sc.(H)Mathematics\n\n" +

                            "B.Sc.Physical Science(Computers)\n" +
                            "B.Sc.Physical Science(Electronics)\n" +
                            "B.Sc.Physical Science(Chemistry)\n" +
                            "B.Sc.Life science\n\n" +
                            "B.Com(H)\n",

                    // aditi mahavidhalaya
                    "B.A.(Programme) \n" +
                            "B.A.(H)Geography \n" +
                            "B.A.(H)Social Work \n" +
                            "B.A.(H)Hindi Patrakarita\n\n" +
                            " B.Com.(Hons.)\n" +
                            " B.Com. \n\n" +
                            "B.El.Ed.\n",

                    //aryabhata college
                    "B.Com\t\n" +
                            "B.Com (H)\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)Business Economics\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(H)Hindi\n\n" +
                            "B.Sc(H)Mathematics\n" +
                            "B.Sc(H)Computer Science\n\n" +
                            "B.A.Programme(Political Science)\n" +
                            "B.A.Programme(History)\n" +
                            "Bachelor in Management Studies\n" +
                            "B.A.(H)Psychology\n" +
                            "B.A.(H)History",

                    //atma ram sanatan dhararm
                    "B.A (Hons) Economics\n" +
                            "B.A(Hons)History\n" +
                            "B.A(Hons)Hindi\n" +
                            "B.A(Hons)Political Science\n" +
                            "B.A(Programme)\n" +
                            "B.A.(Hons.)English\n\n" +
                            "B.Com(Hons.)\n" +
                            "B.Com.(Course)\n\n" +
                            "B.Sc.(Applied Phy. Sc.) Industrial Chemistry\n" +
                            "B.Sc.(H)Chemistry\n" +
                            "B.Sc.(H)Computer Science\n" +
                            "B.Sc.(H)Electronics\n" +
                            "B.Sc.(H)Mathematics\n" +
                            "B.Sc.(H)Physics\n" +
                            "B.Sc.(Phy. Sc.)Chemistry\n" +
                            "B.Sc.(Phy. Sc.)Computer Science\n" +
                            "B.Sc.(Phy. Sc.)Electronics\n" +
                            "B.Sc.(Prog.)Physical Science",


                    //bhagini nivedita
                    "B.A.(Hons.)Hindi\n" +
                            "B.A(Programme)\n\n" +
                            "B.Com\n\n" +
                            "B.Sc Physical Science\n" +
                            "B.Sc.(H)History\n" +
                            "B.Sc.(H)Home Science\n" +
                            "B.Sc.(H)Physics\n",


                    // bharti college
                    "B.A. Honours English\n" +
                            "B.A. Honours Hindi \n" +
                            "B.A. Honours History \n" +
                            "B.A. Honours Psychology  \n" +
                            "B.A. Honours Sociology \n" +
                            "B.A. Honours Political Science \n" +
                            "B.A. Honours Sanskrit,B.Com Honours \n" +
                            "B.Com Programme\n" +
                            "B.A. Programme \n" +
                            "B.A. Honours Journalism \n" +
                            "B.Sc Honours Mathematics\n",

                    //bhaskaracharya
                    "B.Sc.(H)Biomedical Science\n" +
                            "B.Sc.(H)Computer Science\n" +
                            "B.Sc.(H)Electronics\n" +
                            "B.Sc.(H)Food Technology\n" +
                            "B.Sc.(H)Instrumentation\n" +
                            "B.Sc.(H)Microbiology\n" +
                            "B.Sc.(H)Physics\n" +
                            "B.Sc.(H)Polymer Science\n" +
                            "B.Sc.(H)Botany\n" +
                            "B.Sc.(H)Chemistry\n" +
                            "B.Sc.(H)Zoology",

                    //College Of arts
                    "BFA Specialization\n\n +" +
                            "Applied Art\n+" +
                            "Painting\n" +
                            "Sculpture\n" +
                            "Art History\n" +
                            "Printmaking\n " +
                            "Visual Communication",

                    //College Of Vocational Studies
                    "B.Com (Hons.)\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Business Economics\n\n" +
                            "Bachelor in Management Studies\n\n" +
                            "B.Sc.(H)Computer Science\n",


//daulat ram
                    "B.Com (Hons.)\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Phylosophy\n" +
                            "B.A.(H)Psychology\n" +
                            "B.A.(H)Physical Education\n" +
                            "B.A.(H)Sanskrit\n\n" +

                            "B.Com(Hons.)\n\n" +

                            "B.Sc.(H)Botany\n" +
                            "B.Sc.(H)Biochemistry\n" +
                            "B.Sc.(H)Mathematics\n" +
                            "B.Sc.(H)Physics\n" +
                            "B.Sc.(H)Zoology\n" +
                            "B.Sc.(H)Nutrition and Health Management\n" +
                            "B.Sc.(H)Chemistry\n",


//dayal singh
                    "B.A. Programme\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(H)Geography\n" +
                            "B.A.(H)Urdu\n" +
                            "B.A.(H)Punjabi\n" +
                            "B.A.(H)Sanskrit\n" +
                            "B.A.(H)Philosophy\n" +
                            "B.A.(H)English\n\n" +
                            "B.Com\n" +
                            "B.Com (Hons.)\n\n" +

                            "B.Sc Physical Science\n" +
                            "B.Sc Physical Science with Computer Sciences\n" +
                            "B.Sc Life Science\n" +
                            "B.Sc(H)Mathematics\n" +
                            "B.Sc(H)Botany\n" +
                            "B.Sc(H)Chemistry\n" +
                            "B.Sc(H)Physics\n" +
                            "B.Sc(H)Zoology\n" +
                            "B.Sc(H)Computer Sciences\n",


                    //dayal singh evening
                    "B.Com (Hons.)\n" +
                            "B.Com Programme\n\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.Programme with Computer Application\n",

                    //deen dayal
                    "B.A.(H)English\n" +
                            "B.A.Programme\n" +
                            "B.Com.(H)\n" +
                            "B.Sc.Life Sciences\n" +
                            "B.Sc.Physical Sciences(Chemistry)\n" +
                            "B.Sc.Physical Sciences(Computer Science)\n" +
                            "B.Sc.Mathematical Science\n" +
                            "B.Sc.(H)Botany\n" +
                            "B.Sc.(H)Chemistry\n" +
                            "B.Sc.(H)Computer Science\n" +
                            "B.Sc.(H)Electronics\n" +
                            "B.Sc.(H)Mathematics\n" +
                            "B.Sc.(H)Physics\n" +
                            "B.Sc.(H)Zoology\n" +
                            "Bachelor in Management Studies",

//delhicollegeofartsandcommerce
                    "B.Com. (Honours)\n" +
                            "B.A.(Honours)Economics\n" +
                            "B.A.(Honours)English\n" +
                            "B.A.(Honours)Journalism\n" +
                            "B.A.(Honours)History\n" +
                            "B.A.(Honours)Political Science\n\n" +
                            "B.Com.(Programme)\n\n" +
                            "B.A.(Programme)",

//deshbandhu
                    "B.A. programme \n" +
                            "B.A.programme with Bengali, Punjabi, Sanskrit\n" +
                            "B.A.programme with Philosophy\n" +
                            "B.A.(Hons.)Economics\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Sanskrit\n\n" +
                            "B.Com.(Hons.)\n\n" +
                            "B.Sc.(Hons.)Botany\n" +
                            "B.Sc.(Hons.)Chemistry\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Hons.)Physics\n" +
                            "B.Sc.(Hons.)Zoology\n\n" +
                            "B.Sc.(General)Industrial Chemistry\n" +
                            "B.Sc.Physical Science\n" +
                            "B.Sc.Physical Science(Computer Science)",

//bhim rao ambedkar
                    "B.A.(Hons.)Applied Psychology\n" +
                            "B.A.(Hons.)Business Economics (through entrance)\n" +
                            "B.A.(Hons.)Geography\tPDF icon B.A. (H) Geography.pdf\n" +
                            "B.A.(Hons.)Hindi Journalism and Mass Communication\n" +
                            "B.A.(Hons.)Social Work\n" +
                            "B.A.(Hons.)History\n\n" +
                            "B.Com.(Hons.)\n" +
                            "B. Com.\n\n" +
                            "B.A. Programme",

//gargi
                    "B.Sc.(Hons.)Botany\n" +
                            "B.Sc.(Hons.)Chemistry\n" +
                            "B.Sc.(Hons.)Microbiology\n" +
                            "B.Sc.(Hons.)Zoology\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Hons.)Physics\n\n" +
                            "B.Com\n\n" +
                            "B.A(Hons.)Business Economics\n" +
                            "B.A(Hons.)Political Science\n" +

                            "B.A(Hons.)Hindi\n" +
                            "B.A(Hons.)History\n" +
                            "B.A(Hons.)Economics\n" +
                            "B.A(Hons.)English\n" +
                            "B.A(Hons.)Philosophy\n" +
                            "B.A(Hons.)Psychology\n" +
                            "B.A(Hons.)German\n" +
                            "B.A(Hons.)Physical Education" +
                            "B.A(Hons.)Sanskrit\n\n" +
                            "B.A. Programme\n\n" +
                            "Elementary Education\n",

//hansraj
                    "B.Sc.(Hons.)Anthropology\n" +
                            "B.Sc.(Hons.)Botany\n" +
                            "B.Sc.(Hons.)Chemistry\n" +
                            "B.Sc.(Hons.)Computer Science\n" +
                            "B.Sc.(Hons.)Electronics\n" +
                            "B.Sc.(Hons.)Geology\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Hons.)Zoology\n" +
                            "B.Sc.(Hons.)Physics\n" +
                            "B.Sc.Physical Sciences\n" +
                            "B.Sc.Life Sciences\n\n" +
                            "B.Com(Hons.)\n\n" +
                            "B.A.Programme\n\n" +
                            "B.A(Hons.)Hindi\n" +
                            "B.A(Hons.)History\n" +
                            "B.A(Hons.)Economics\n" +
                            "B.A(Hons.)English\n" +
                            "B.A(Hons.)Sanskrit\n",

//hindu
                    "B.Sc.(Hons.)Botany\n" +
                            "B.Sc.(Hons.)Chemistry\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Hons.)Physics\n" +
                            "B.Sc.(Hons.)Zoology\n\n" +
                            "B.Com(Hons.)\n\n" +
                            "B.A(Hons.)Economics\n" +
                            "B.A(Hons.)English\n" +
                            "B.A(Hons.)Hindi\n" +
                            "B.A(Hons.)History\n" +
                            "B.A(Hons.)Philosophy\n" +
                            "B.A(Hons.)Political Science\n" +
                            "B.A(Hons.)Sanskrit\n" +
                            "B.A(Hons.)Sociology\n" +
                            "B.A(Hons.)Statistics\n",


                    "B.Sc(P.E.,H.E & S)",

                    //indraprastha college for women
                    "B.Com\n" +
                            "B.Sc(Hons.)Computer Science\n" +
                            "B.Sc(Hons.)Mathematics\n\n" +
                            "B.A(Hons.)Economics\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Environmental Studies\n" +
                            "B.A.(Hons.)Geography\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Multimedia and Mass Communication\n" +
                            "B.A.(Hons.)Music\n" +
                            "B.A.(Hons.)Philosophy\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Psychology\n" +
                            "B.A.(Hons.)Sanskrit\n" +
                            "B.A.(Hons.)Sociology\n\n" +
                            "B.A Program",

//institue of home economics
                    "B.Sc Home Science (Honours)\n" +
                            "B.Sc Home Science (Pass)\n" +
                            "B.Sc Biochemistry (Honours)\n" +
                            "B.Sc Microbiology (Honours)\n" +
                            "B.Sc Food Technology (Honours)\n\n" +
                            "B.A. Journalism (Honours)\n\n" +
                            "Bachelor of Elementary Education",


                    "B.A(Hons.)Economics\n" +
                            "B.A(Hons.)English\n" +
                            "B.A(Hons.)Hindi\n" +
                            "B.A(Hons.)History\n" +
                            "B.A(Hons.)Philosophy\n" +
                            "B.A(Hons.)Political Science\n" +
                            "B.A(Hons.)Sanskrit\n" +
                            "B.A(Hons.)Sociology\n\n" +
                            "B.A.Programme\n\n" +
                            "B.Sc(Hons.)Mathematics\n\n" +
                            "B.Com\n" +
                            "B.Com(Hons.)\n",

//jesus and mery

                    "B.Com(Hons.)\n\n" +
                            "B.A(Hons.)Economics\n" +
                            "B.A(Hons.)Elementary Education\n" +
                            "B.A(Hons.)English\n" +
                            "B.A(Hons.)Hindi\n" +
                            "B.A(Hons.)History\n" +
                            "B.A(Hons.)Philosophy\n" +
                            "B.A(Hons.)Physical Education\n" +
                            "B.A(Hons.)Political Science\n" +
                            "B.A(Hons.)Psychology\n" +
                            "B.A(Hons.)Sociology\n" +
                            "B.A(Hons.)Spanish\n\n" +
                            "B.Sc(Hons.)Mathematics\n" +
                            "B.Sc(Hons.)Computer Science",

                    //kalindin college
                    "B.A.(Hons)English\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Sanskrit\n" +
                            "B.A.(Programme)\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Journalism\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(H)Geography\n" +
                            "B.A.(Hons.)Economics\n\n" +
                            "B.Com.Programme\n" +
                            "B.Com.(Hons.)\n\n" +
                            "B.Sc.(Prog.) Life Sciences\n" +
                            "B.Sc.(prog.) Physical Sciences\n" +
                            "B.Sc(H)Computer Science\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Hons.)Physics\n" +
                            "B.Sc(H)Botany\n" +
                            "B.Sc(H)Chemistry\n" +
                            "B.Sc(H)Zoology\n\n" +
                            "B.Voc",

//kamala nehru college
                    "Journalism\n\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Geography\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)\n" +
                            "B.A. (Hons.)Philosophy\n" +
                            "B.A. (Hons.)Psychology" +
                            "B.A. (Hons.) Political Science\n" +
                            "B.A. (Hons.) Sanskrit\n" +
                            "B.A. (Hons.) Sociology\n\n" +
                            "B.A. (Programme)\n\n" +
                            "B.Com. (Hons.)\n" +
                            "B.Com. (Programme)\n\n" +
                            "B.Sc.(Hons.)Mathematics\n",

//keshav mahavidyalaya
                    "B.Com.(Hons.)\n" +
                            "B.Sc.(Hons.)Computer Science\n" +
                            "B.Sc.(Hons.)Electronics\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Prog.)Mathematical Sciences\n" +
                            "B.Sc.(Hons.)Physics\n\n" +
                            "B.Sc.(Prog.)Physical Science with Computer Science\n\n" +
                            "Bachelor of Management Studies\n\n" +
                            "B.A.(Hons.)Psychology",

//kirori mal
                    "B.A. (Programme)\n" +
                            "B.A. (Programme) with Bengali\n\n" +
                            "B.Com.\n" +
                            "B.Com.(Hons.)\n\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Geography\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(H)Sanskrit\n" +
                            "B.A.(H)Urdu\n\n" +
                            "B.Sc.Physical Sciences\n" +
                            "B.Sc.Physical Sciences with Computer Science Option\n" +
                            "B.Sc.Life Science\n" +
                            "B.Sc.Applied Physical Sciences (Analytical Chemistry)\n\n" +
                            "B.Sc.(H)Botany\n" +
                            "B.Sc.(H)Chemistry\n" +
                            "B.Sc.(H)Physics\n" +
                            "B.Sc.(H)Mathematics\n" +
                            "B.Sc.(H)Statistics\n" +
                            "B.Sc.(H)Zoology",

//lady irwin
                    "B.Sc.Home Science\n" +
                            "B.Sc.(Hons.)Home Science\n" +
                            "B.Sc.(Hons)Food Technology",

//lady shri ram
                    "B.A. Programme\n" +
                            "B.Com\n\n" +
                            "B.A(Hons.)Mathematics\n\n" +
                            "B.A(Hons.)Economics\n" +
                            "B.A(Hons.)Elementary Education\n" +
                            "B.A(Hons.)English\n" +
                            "B.A(Hons.)Hindi\n" +
                            "B.A(Hons.)History\n" +
                            "B.A(Hons.)Journalism\n" +
                            "B.A(Hons.)Philosophy\n" +
                            "B.A(Hons.)Political Science\n" +
                            "B.A(Hons.)Psychology\n" +
                            "B.A(Hons.)Sanskrit\n" +
                            "B.A(Hons.)Sociology\n" +
                            "B.A(Hons.)Statistics",

//lakshimabi college
                    "B.A. (Hons) Economics\n" +
                            "B.A.(Hons) English\n" +
                            "B.A.(Hons) Hindi\n" +
                            "B.A.(Hons) History \n" +
                            "B.A.(Hons) Philosophy\n" +
                            "B.A.(Hons) Political Science\n" +
                            "B.A.(Hons) Sanskrit\n" +
                            "B.A.(Programme)\n\n" +
                            "B.Com.(Hons)\n" +
                            "B.Com.(Programme)\n" +
                            "B.Sc.(Hons)Mathematics\n",

                    //maharaja agrasena college
                    "B.A.(H)Business Economics(BBE)\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Journalism\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(Programme)\n" +
                            "B.Com.(H)\n" +
                            "B.Sc.(Physical Science)\n" +
                            "B.Sc.(H)Electronics\n" +
                            "B.Sc.(H)Mathematics\n",

                    //maharishi valmiki college
                    "Bachelor of Education Programme(B.Ed)",

                    //maitreyi college du
                    "B.Sc(H)Botany\n" +
                            "B.Sc(H)Chemistry (Integrated)\n" +
                            "B.Sc(H)Mathematics\n" +
                            "B.Sc(H)Physics (Integrated)\n" +
                            "B.Sc(H)Zoology\n" +
                            "B.Sc Programme Physical Science (Physics, Chemistry / Computer Science, Maths)\n" +
                            "B.Sc Life Sciences (Botany Chemistry, Zoology)\n\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(H)Sanskrit\n" +
                            "B.A.(H)Sociology\n" +
                            "B.A.Programme\n\n" +
                            "B.Com(Programme)\n" +
                            "B.Com(H)",

//mata sundri
                    "B.A.(Programme)\n" +
                            "B.Com(Programme)\n" +
                            "B.Com(H)\n\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Philosophy\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(H)Psychology\n" +
                            "B.A.(H)Punjabi\n" +
                            "B.A.(H)Sanskrit\n" +
                            "B.Sc.(H)Mathematics\n" +
                            "B.Sc.(H)Statistics\n" +
                            "B.Sc.(H)Computer Science\n\n" +
                            "B.El.Ed.",

//miranda house
                    "B.A. Programme\n" +

                            "B.A.(H)Bengali\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Geography\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Music\n" +
                            "B.A.(H)Philosophy\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(H)Sanskrit\n" +
                            "B.A.(H)Sociology\n" +
                            "B.Sc.(H)Botany\n" +
                            "B.Sc.(H)Chemistry\n" +
                            "B.Sc.(H)Mathematics\n" +
                            "B.Sc.(H)Physics\n" +
                            "B.Sc.(H)Zoology\n" +
                            "B.Sc. Programme\n" +
                            "B.Sc. Life Sciences\n" +
                            "B.Sc. Physical Sciences\n" +
                            "B.El.Ed.",


                    //motilal nehru
                    "B.Com(Hons.)" +
                            "B.Sc.(H)Chemistry\n" +
                            "B.Sc.(H)Computer Science\n" +
                            "B.Sc.(H)Mathematics\n" +
                            "B.Sc.(H)Physics\n\n" +

                            "B.A.(H)Economics\n" +
                            "B.A.(H)English\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Political Science\n" +
                            "B.A.(H)Sanskrit\n",

//motilal eve
                    "Bachelor with Honours in English\n" +
                            "Bachelor with Honours in Hindi\n" +
                            "Bachelor with Honours in History\n" +
                            "Bachelor with Honours in Political Science\n" +
                            "Bachelor with Honours in Commerce\n" +
                            "B.A. (Programme)\n" +
                            "Bachelor of Commerce",


//PGDAV
                    "B.A. Programme\n\n" +
                            "B.Com.\n" +
                            "B.Com.(Hons)\n\n" +
                            "B.A.(Hons)Economics\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Sanskrit\n\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Hons)Statistics\n" +
                            "B.Sc.(Hons)Computer Science\n\n" +
                            "B.Sc. Mathematical Science",

//pgdav eve
                    "B.A.(Prog.)\n\n" +
                            "B.Com(Prog.)\n" +
                            "B.Com(H)\n\n" +
                            "B.A.(H)Pol.Sc.\n" +
                            "B.A.(H)Hindi\n\n" +
                            "B.Sc.(H)Mathematics",

//rajdhani

                    "B.Com(Hons)\n\n" +
                            "B.A Programme\n" +
                            "B.A(Hons) Political Science\n" +
                            "B.A(Hons) Sanskrit\n" +
                            "B.A(Hons) Hindi\n" +
                            "B.A(Hons) Economics\n" +
                            "B.A(Hons) English\n" +
                            "B.A(Hons) History\n\n" +
                            "B.Sc(Hons)Chemistry\n" +
                            "B.Sc(Hons) Electronics" +
                            "B.Sc(Hons) Mathematics\n" +
                            "B.Sc(Hons) Physics\n" +

                            "B.Sc(APS) Industrial Chemistry\n" +

                            "B.Sc(Physical Science) Chemistry\n" +
                            "B.Sc(Physical Science) Electronics\n" +
                            "B.Sc(Physical Science) Computer Science\n"
                    ,

//ramlal anand
                    "B.A.(Prog.)\n\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)BJMC\n" +
                            "B.A.(Hons.)Pol. Sc.\n" +
                            "B.A.(Hons.)History\n\n" +
                            "B.Com(Prog.)\n" +
                            "B.Com(Hons.)\n\n" +
                            "B.Sc.(Hons.)Comp. Sc.\n" +
                            "B.Sc.(Hons.)Geology\n" +
                            "B.Sc.(Hons.)Microbiology\n" +
                            "B.Sc.(Hons.)Statistics\n" +
                            "B.Sc.(Hons.)Mathematics\n\n" +
                            "Bachelor of Management Studies",

//ramanunjan college
                    "B.Com(Hons.)\n" +
                            "B.Com\n\n" +
                            "Bachelor of Management Studies\n" +
                            "B.A(Hons.) Political Science\n" +
                            "B.A(Hons.)Hindi\n" +
                            "B.A(Hons.)Philosophy" +
                            "B.A(Hons.)Economics" +
                            "B.A(Hons.)Applied Psychology\n" +
                            "B.A(Hons.)English\n\n" +
                            "B.A Programme\n\n" +
                            "B.Sc(Hons.)Statistics\n" +
                            "B.Sc(Hons.)Mathematics\n" +
                            "B.Sc(Hons.)Computer Science",

//ramjas
                    "B.A. Programme\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Sanskrit\n" +
                            "B.A.(Hons.)Economics\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Music\n\n" +

                            "B.Sc. (Hons.) Mathematics\n" +
                            "B.Sc. (Hons.) Statistics\n" +
                            "B.Sc (Hons.) Botany\n" +
                            "B.Sc (Hons.) Zoology\n" +
                            "B.Sc. (Hons.) Physics\n" +
                            "B.Sc. (Hons.) Chemistry\n\n" +
                            "B.Sc. (Prog.) Life Sciences\n" +
                            "B.Sc. (Prog.) Physical Sciences\n\n" +
                            "B. Com (Hons.)\n" +
                            "B. Com Programme",

//satyawati
                    "B.COM(H)\n" +
                            "B.COM(P)\n" +
                            "B.A.(Prog.)\n\n" +
                            "B.A.(H)ECONOMICS\n" +
                            "B.A.(H)ENGLISH\n" +
                            "B.A.(H)HINDI\n" +
                            "B.A.(H)HISTORY\n" +
                            "B.A.(H)POLITICAL SCIENCE\n" +
                            "B.A.(H)SANSKRIT\n" +
                            "B.A.(H)URDU\n" +
                            "B.SC.(H)MATHEMATICS\n"
                    ,

//satyawati eve
                    "B.A.(Prog.)\n\n" +
                            "B.Com(Hons.)\n" +
                            "B.Com(Prog.)\n\n" +
                            "Economics (Hons.)\n" +
                            "English (Hons.)\n" +
                            "Hindi (Hons.)\n" +
                            "History (Hons.)\n" +
                            "Pol Science (Hons.)",

                    "B.Com. (Hons.)\n" +
                            "B.Com\n" +
                            "B.A.(H)Economics\n" +
                            "B.A.(H)History\n" +
                            "B.A.(H)Pol. Science\n" +
                            "B.A.(H)Geography\n" +
                            "B.A.(H)Hindi\n" +
                            "B.A.(H)English\n" +
                            "B.A.(Prog.)" +
                            "B.Sc.(H)Mathematics\n",

                    //shahhed bhagat singh college evening
                    "B.Com(H)\n\n" +
                            "B.A.(Hons.)Geography\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Economics\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Pol. Science\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Physical Education",


                    //shaheed rajguru college of applied sciences
                    "B.Sc. (Hons.) Electronics\n" +
                            "B.Sc.(Hons.)Instrumentation\n" +
                            "B.Sc.(Hons.)Food Technology\n" +
                            "B.Sc.(Hons.)Computer Science\n" +
                            "B.Sc.(Hons.)Biomedical Science\n" +
                            "B.Sc.(Hons.)Physics\n" +
                            "B.Sc.(Hons.)Chemistry\n" +
                            "B.Sc.(Hons.)Mathematics\n" +
                            "B.Sc.(Hons.)Microbiology\n" +
                            "B.Sc.(Hons)Statistics\n" +
                            "B.Sc.(Hons.)Biochemistry\n" +
                            "B.Sc.(Hons.)Biochemistry\n\n" +
                            "B.A.(Hons)Psychology\n\n" +
                            "Bachelor of Management Studies\n" +
                            "Bachelor of Business Administration (FIA)\n"
                    ,

                    //shaheed sukhdev college of business studies
                    "Bachelor of Management Studies\n" +
                            "Bachelor of Financial & Investment Analysis\n" +
                            "Bachelor of Bussiness Studies\n\n" +
                            "B.Sc(Hons)Computer Science\n",

                    //shivaji college

                    "B.Sc(Hons)Biochemistry\n" +
                            "B.Sc(Hons)Botany\n" +
                            "B.Sc(Hons)Physics\n" +
                            "B.Sc(Hons)Zoology\n" +
                            "B.Sc(Hons)Mathematics\n" +
                            "B.Sc(Hons)Computer Science\n" +
                            "B.Sc(Hons)Environmental Studies\n" +
                            "B.Sc(Hons)Chemistry\n\n" +
                            "B.Com(H)\n\n" +
                            "B.A.(Hons.)Economics\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Geography\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Physical Education\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Sanskrit\n" +
                            "B.A.(Hons.)Sociology\n\n" +
                            "Bachelor Business Economics\n",

                    // shri ram college
                    "B.Com(H)\n\n" +
                            "B.A. (H) Economics\n\n",

                    "B.Sc in Physical Science\n" +
                            "B.Sc Physical Science in Chemistry\n" +
                            "B.Sc Physical Science in Computer Science\n" +
                            "B.Sc Physical Science in Electronics\n\n" +
                            "B.Com(Hons.)\n" +
                            "B.Com\n\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Pol. Science\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Ecnomics\n" +
                            "B.A.(Hons.)History\n",


                    "B.Com. Programme\n" +
                            "B.Com.(Hons.)\n\n" +
                            "B.A.(Hons.) Economics\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Pol. Science\n" +
                            "B.A. Programme",

                    //sri aurobindo college
                    "B.Sc(Hons) Botany\n" +
                            "B.Sc(Hons)Maths\n" +
                            "B.Sc(Hons)Physics\n" +
                            "B.Sc(Hons) Electronics\n" +
                            "B.Sc(Hons)Zoology\n" +
                            "B.Sc(Hons)Computer Science\n" +
                            "B.Sc(Hons)Environmenal Science\n" +
                            "B.Sc(Hons) Chemistry\n\n" +
                            "B. Com (Hons.)\n\n" +
                            "B.A.(Hons.)Economics\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Physical Education\n" +
                            "B.A.(Hons.)Sanskrit\n",

                    //sri aurobindo college
                    "B. Com\n" +
                            "B. Com (Hons.)\n\n" +
                            "B.A(Programme)\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.) App. Psy.\n\n",

                    //sri guru govind singh college
                    "B. Com (Hons)\n" +
                            "B.Com\n\n" +
                            "B.A.(Hons) Economics\n" +
                            "B.A(H)Punjabi\n" +
                            "B.A.(Hons)Business Economics\n\n" +
                            "B.Sc.(Hons)Computer Science\n",

                    //sri guru nanak dev khalsa college
                    "B.Com (Hons.)\n" +
                            "B.Com Prog.\n\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Punjabi\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Hindi Journalism & Mass Communication\n" +
                            "B.A.(Hons.)Business Economics\n" +
                            "B.A.(Hons.)Mathematics\n" +
                            "B.A.Programme\n\n",

                    //sri guru teg bahadur
                    "B.Com (Program)\n" +
                            "B.Com (Hons)\n\n" +
                            "B.Sc Life Science\n" +
                            "B.Sc Physical Science\n" +
                            "B.Sc(Hons)Botany\n" +
                            "B.Sc(Hons)Chemistry\n" +
                            "B.Sc(Hons)Computer Science\n" +
                            "B.Sc(Hons)Electronics\n" +
                            "B.Sc(Hons)Mathematics\n" +
                            "B.Sc(Hons)Zoology\n" +
                            "B.Sc(Hons)Physics\n\n" +
                            "B.A.(Hons)Economics\n" +
                            "B.A.(Hons)English\n" +
                            "B.A.(Hons)Hindi\n" +
                            "B.A.(Hons)History\n" +
                            "B.A.(Hons)Political Science\n" +
                            "B.A.(Hons)Physical Education\n" +
                            "B.A(Program\n" +
                            "B.A.(Hons)Punjabi\n",

                    //sri Venketashwara college
                    "B.A.(Programme)\n" +
                            "B.A.(Hons)English\n" +
                            "B.A.(Hons)Hindi\n" +
                            "B.A.(Hons)Sanskrit\n" +
                            "B.A.(Hons)Economics\n" +
                            "B.A.(Hons)History\n" +
                            "B.A.(Hons)Political Science\n" +
                            "B.A.(Hons)Sociology\n\n" +
                            "B.Com\n" +
                            "B.Com (Hons)\n\n" +
                            "B.Sc(Programme)Life Sciences\n" +
                            "B.Sc(Hons)Bio-Chemistry\n" +
                            "B.Sc(Hons)Biological Sciences\n" +
                            "B.Sc(Hons)Botany\n" +
                            "B.Sc(Hons)Chemistry\n" +
                            "B.Sc(Hons)Electronics\n" +
                            "B.Sc(Hons)Mathematics\n" +
                            "B.Sc(Hons)Physics\n" +
                            "B.Sc(Hons)Statistics\n" +
                            "B.Sc(Hons)Zoologyn\n\n",

                    //st stephen college
                    "B.A.(H) Economics \n" +
                            "B.A.(H) English\n" +
                            "B.A.(H) History\n" +
                            "B.A.(H) Sanskrit\n" +
                            "B.A.(H) Philosophy\n\n" +
                            "B.Sc.(H) Chemistry\n" +
                            "B.Sc.(H) Mathematics\n" +
                            "B.Sc.(H) Physics\n\n" +
                            "B.Sc. Programme (Physical Science)\n" +
                            "B.A. Programme\n",

                    //swami shraddhananda college
                    "B.A.(H) English\n" +
                            "B.A.(H) Geography\n" +
                            "B.A.(H) Hindi\n" +
                            "B.A.(H) History\n" +
                            "B.A.(Program)\n\n" +
                            "B.Com.(H)\n" +
                            "B.Com.(Prog)\n\n" +
                            "B.Sc.(H) Botany\n" +
                            "B.Sc.(H) Chemistry\n" +
                            "B.Sc.(H) Microbiology\n" +
                            "B.Sc.(H) Physics\n" +
                            "B.Sc.(H) Zoology\n" +
                            "B.Sc.(H) Physical Science\n" +
                            "B.Sc. Life Science\n" +
                            "B.Sc. Applied Life Science",

                    //viveknand college
                    "B.A.(Hons.)Applied Psychology\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)Sanskrit\n\n" +
                            "B.Com(Hons.)Commerce\n\n",

                    //zakhir hussain colege
                    " B.Sc. (H) Botany\n" +
                            "B.Sc.(H) Chemistry\n" +
                            "B.Sc. (H) Electronics\n" +
                            "B.Sc. (H) Mathematics\n" +
                            "B.Sc.(H) Zoology\n" +
                            "B.Sc. Life Sciences\n" +
                            "B.Sc. Physical Sciences\n\n" +
                            "B.Com.(Hons.)\n" +
                            "B.Com.\n\n" +
                            "B.A.(Hons.) Arabic\n" +
                            "B.A.(Hons.) Bengali\n" +
                            "B.A.(Hons.) Economics\n" +
                            "B.A.(Hons.) English\n" +
                            "B.A.(Hons.) Hindi\n" +
                            "B.A.(Hons.) History\n" +
                            "B.A.(Hons.) Persian\n" +
                            "B.A.(Hons.) Philosophy\n" +
                            "B.A.(Hons.) Political Science\n" +
                            "B.A.(Hons.) Psychology\n" +
                            "B.A.(Hons.) Sanskrit\n" +
                            "B.A.(Hons.) Urdu\n" +
                            "B.A.(Prog.) Arabic\n" +
                            "B.A.(Prog.) Bengali MIL & LS\n" +
                            "B.A.(Prog.) Economics\n" +
                            "B.A.(Prog.) English\n" +
                            "B.A.(Prog.) Hindi\n" +
                            "B.A.(Prog.) History\n" +
                            "B.A.(Prog.) HRM Commerce\n" +
                            "B.A.(Prog.) Mathematics\n" +
                            "B.A.(Prog.) Persian\n" +
                            "B.A.(Prog.) Philosophy\n" +
                            "B.A.(Prog.) Political Science\n" +
                            "B.A.(Prog.) Psychology\n" +
                            "B.A.(Prog.) Sanskrit\n" +
                            "B.A.(Prog.) Urdu",


                    // zakhir hussain eve
                    "B. Com\n" +
                            "B. Com (Hons.)\n\n" +
                            "B.A (Prog.)\n" +
                            "B.A.(Hons.)Hindi\n" +
                            "B.A.(Hons.)Persian\n" +
                            "B.A.(Hons.)Political Science\n" +
                            "B.A.(Hons.)History\n" +
                            "B.A.(Hons.)English\n" +
                            "B.A.(Hons.)Sanskrit\n" +
                            "B.A.(Hons.)Urdu"
            };


    String[] collink = {
            "http://andcollege.du.ac.in/",
            "http://aditi.du.ac.in/",
            "http://aryabhattacollege.ac.in/",
            "http://arsdcollege.ac.in/",
            "http://www.bhagininiveditacollege.in/",
            "https://www.bharaticollege.org/",
            "http://bcas.du.ac.in/",
            "http://delhi.gov.in/wps/wcm/connect/Lib_Collegeofart/collegeofarts/home",
            "http://www.cvs.edu.in/",
            "http://dr.du.ac.in/",
            "https://crclab.wixsite.com/dscm",
            "http://dsce.du.ac.in/",
            "https://dducollegedu.ac.in/",
            "http://www.dcac.du.ac.in/",
            "https://www.deshbandhucollege.ac.in/",
            "http://www.drbrambedkarcollege.ac.in/",
            "http://gargi.du.ac.in/",
            "https://www.hansrajcollege.ac.in/",
            "http://www.hinducollege.ac.in/",
            "http://igipess1.du.ac.in:8080/web/home_page.jsp",
            "http://www.ipcollege.ac.in/",
            "http://www.ihe-du.com/",
            "http://jdm.du.ac.in/",
            "http://www.jmc.ac.in/",
            "http://kalindi.du.ac.in/",
            "https://www.knc.edu.in/",
            "http://keshav.du.ac.in/",
            "http://www.kmcollege.ac.in/",
            "http://www.ladyirwin.edu.in/",
            "http://lsr.edu.in/",
            "https://lakshmibaicollege.in/",
            "http://mac.du.ac.in/",
            "http://www.mvce.ac.in/",
            "http://maitreyi.ac.in/",
            "http://www.ms.du.ac.in/",
            "http://www.mirandahouse.ac.in/",
            "http://www.mlncdu.ac.in/",
            "http://www.mlnce.org/",
            "http://pgdavcollege.edu.in/",
            "https://www.pgdaveve.in/",
            "http://rajdhanicollege.ac.in/",
            "https://rlacollege.edu.in/",
            "http://rcdu.in/",
            "http://ramjas.du.ac.in/",
            "http://satyawati.du.ac.in/",
            "http://satyawatievedu.ac.in/",
            "http://www.sbsc.in/",
            "http://www.sbsec.org/",
            "http://www.rajgurucollege.com/",
            "http://sscbs.du.ac.in/",
            "http://www.shivajicollege.ac.in/",
            "http://www.srcc.edu/",
            "http://shyamlal.du.ac.in/",
            "http://shyamlale.du.ac.in/",
            "http://www.aurobindo.du.ac.in/",
            "http://www.saceve.in/",
            "http://www.sggscc.ac.in/",
            "https://sgndkc.org/",
            "http://www.sgtbkhalsadu.ac.in/",
            "http://www.svc.ac.in/",
            "http://www.ssncollege.com/",
            "http://www.ssncollege.com/",
            "http://vivekanandacollege.edu.in/",
            "http://www.zakirhusaindelhicollege.ac.in/",
            "http://www.zakirhusainpgeve.in/"};

    String colmap[] = {
            "acharya+narendra+dev+college+du",
            "aditi+mahavidyalaya+college+du",
            "Aryabhatta+College+du",
            "Atma+Ram+Sanatan+Dharma+College+du",
            "Bhagini+Nivedita+College+du",
            "Bharati+College+du",
            "Bhaskaracharya+College+Of+Applied+Sciences+du",
            "College+Of+Arts+du",
            "College+Of+Vocational+Studies+du",
            "Daulat+Ram+College+du",
            "Dyal+Singh+College+du",
            "Dyal+Singh+College+du",
            "Deen+Dayal+Upadhyaya+College+du",
            "Delhi+ollege+Of+Arts+and+Commerce+du",
            "Deshbandhu+College+du",
            "Dr.+Bhim+Rao+Ambedkar+College+du",
            "Gargi+College+du",
            "Hansraj+College+du",
            "Hindu+College+du",
            "Indira+Gandhi+Institute+of+Physical+Education+and+Sports+Sciences+du",
            "Indraprastha+College+for+women+du",
            "Insitute+Of+Home+Economics+du",
            "Janki+Devi+Memorial+College+du",
            "Jesus+and+Mary+College+du",
            "Kalindi+College+du",
            "Kamala+Nehru+College+du",
            "Keshav+Mahavidyalaya+College+du",
            "Kirori+Mal+College+du",
            "Lady+Irwin+College+du",
            "Lady+Shri+Ram+College+for+women+du",
            "Lakshimbai+College+du",
            "Maharaja+Agrasena+College+du",
            "Maharishi+Valmiki+College+of+Education+du",
            "Maitreyi+College+du",
            "Mata+Sundri+College+for+Women+du",
            "Miranda+House+du",
            "Motilal+Nehru+College+du",
            "Motilal+Nehru+College+du",
            "P.G.D.A.V+college+du",
            "P.G.D.A.V+College+du",
            "Rajdhani+College+du",
            "Ram+Lal+Anand+College+du",
            "Ramanujan+College+du",
            "Ramjas+College+du",
            "Satyawati+College+du",
            "Satyawati+College+du",
            "Shaheed+Bhagat+Singh+College+du",
            "Shahhed+Bhagat+Singh+College+du",
            "Shaheed+Rajguru+College+Of+Applied+Sciences+du",
            "Shaheed+Sukhdev+College+Of+Business+Studies+du",
            "Shivaji+College+du",
            "Shri+Ram+College+Of+Commerce+du",
            "Shyama+Lal+College+du",
            "Shyama+Lal+College+du",
            "Sri+Aurobindo+College+du",
            "Sri+Aurobindo+College+du",
            "Sri+Guru+Gobind+Singh+College+Of+Commerce+du",
            "Sri+Guru+Nanak+Dev+Khalsa+College+du",
            "Sri+Guru+Teg+Bahadur+Khasa+College+du",
            "Sri+Venkateswara+College+du",
            "St.+Stephen's+College+du",
            "Swami+Shraddhanada+College+du",
            "Vivekananda+College+du",
            "Zakir+Hussain+Delhi+College+du",
            "Zakir+Hussain+Delhi+College+du"


    };




    int cImages[] = {
            R.raw.acharya,
            R.raw.aditi,
            R.raw.aryabhatta,
            R.raw.atmaram,
            R.raw.bhagini,
            R.raw.bharati,
            R.raw.bhaskarachary,
            R.raw.collofarts,
            R.raw.cvs,
            R.raw.daulatram,
            R.raw.dayals,
            R.raw.dayaleve,
            R.raw.ddu,
            R.raw.delhicolofanc,
            R.raw.deshbandhu,
            R.raw.bhimrao,
            R.raw.gargi,
            R.raw.hansraj,
            R.raw.hindu,
            R.raw.igi,
            R.raw.indraprastha,
            R.raw.homeeconomics,
            R.raw.janakidevi,
            R.raw.jesusnmerry,
            R.raw.kalindi,
            R.raw.kamalanehru,
            R.raw.keshav,
            R.raw.kirorimal,
            R.raw.lady,
            R.raw.ladyshri,
            R.raw.lakshimibai,
            R.raw.maharaja,
            R.raw.maharishi,
            R.raw.maitreyi,
            R.raw.matasundri,
            R.raw.miranda,
            R.raw.motilal,
            R.raw.motilaleve,
            R.raw.pgd,
            R.raw.pgdeve,
            R.raw.rajdhani,
            R.raw.ramlal,
            R.raw.ramanunjan,
            R.raw.ramjas,
            R.raw.satyawati,
            R.raw.satyawatieve,
            R.raw.shaheed,
            R.raw.shaheed,
            R.raw.shaheedraj,
            R.raw.shaheedsukhdev,
            R.raw.shivajicollege,
            R.raw.ladyshri,
            R.raw.shyamlal,
            R.raw.shyamlal,
            R.raw.sriaurobindo,
            R.raw.sriaurobindo,
            R.raw.srigurugobind,
            R.raw.srigurunanakdev,
            R.raw.srigurutegbahadur,
            R.raw.srivenkatesh,
            R.raw.stephens,
            R.raw.swami,
            R.raw.vivekanada,
            R.raw.zakir,
            R.raw.zakir
    };



    String colphone[] = {
            //acharya
            "011 26294541",
            //aditi
            "011 2752741",
            //aryabhatta
            "011 24110490",
            //atmaram
            "011 24113436",
            //bhagini
            "011 28017485",
            //bhariti
            "011 43273000",
            //bhaskaracharya
            "011 25087597",
            //college of arts
            "011 65417441",
            //college of vocatinal arts
            "011 29258544",
            //Daulat ram college
            "011 27667863",
            //Dyal singh
            "011 24367819",
            //Dyal singh college eve
            "011 24367658",
            //Deen dyal upadhaya
            "011 25099381",
            //Delhi college of arts and commerce
            "011 24109821",
            //Deshbandhu college
            "011 26235542",
            //Dr bhimrao ambedkar
            "011 22814126",
            //Gargi college
            "011 26494544",
            //Hansraj college
            "011 27667747",
            //Hindu college
            "011 27667184",
            //Indira gandhi institue of Physical eduaction
            "011 28544497",
            //Indraprastha college of women
            "011 23954085",
            //Institue of home economics
            "011 26532402",
            //janki devi memorial college
            "011 25787754",
            //jesus and marry coolege
            "011 26875400",
            //kalindi
            "011 25787604",
            //kamla nehru  college
            "011 26494881",
            // keshav mahavidhayala
            "011 27018805",
            // kirori mal  college
            "011 27667861",
            //Lady irvin college
            "011 23711222",
            //lady srhi ram
            "011 26434459",

            //lakshimbhai college
            "011 27308598",
            //Maharaja agrasena college
            "011 22610565",
            //Maharishi valmiki college of education
            "011 22085191",
            //Maitreyi college
            "011 24673815",
            //mata sundari college for women
            "011 23237291",
            //Miranda house
            "011 27666983",
            //motilal nehru college
            "011 24112604",
            //motilal nehru college(eve)
            "011 24110030",
            //PGDAV
            "011 29832092",
            //PGDAV eve
            "011 29845214",
            //Rajdhani college
            "011 25930752",
            //ram lal ananda college
            "011 24112557",
            //Ramanujan college
            "011 26430192",
            //Ramjas college
            "011 27667706",
            //satyawati college
            "011 272195760",
            //satyawati eve
            "011 27213402",
            //Shaheed bhagat singh college
            "011 29250306",
            //Shaheed bhagat singh college(eve)
            "011-29253430",
            //Shaheed rajguru college of applied sciences
            "011 -22623503",
            //shaheed sukhdev college of bussiness studies
            "011-27573446",
            //shivaji college
            "011-25116644",
            //shri ram college of commerce
            "011 – 27667905",
            //shyama lal college
            "011-22324086",
            //shyama lal college(eve)
            "011 2232 4086",
            //Shri Aurobindo college
            "+91-11-26692986",
            //Shri Aurobindo college(eve)
            "011-41751306",
            //Shri guru gobind singh college of commerce
            "011-27321109",
            //shri guru nanak dev khalsa college
            "011-28729399",
            //shri guru teg bahadur khalsa college
            "+91-(011)27666641",
            //Shri venkateshwara college
            "011-2411-2196",
            //st stephens college
            "011 2766 7271",
            //swami shraddhanada college
            "011-27207533",
            //vivekananda college
            "011 2215 0100",
            //zakhir hussain college
            "011 2323 2218",
            //Zakhir hussain college eve
            "011-23231899"
    };

    String colemail[] = {
            "principal@andc.du.ac.in",
            "info@aditi.du.ac.in",
            "admin@aryabhattacollege.ac.in",
            "principal.arsdcollege@gmail.com",
            "bnc.kair@gmail.com",
            "contactus@bharati.du.ac.in",
            "bhaskaracharya.college@bcas.du.ac.in",
            "delhicollageofart@gmail.com",
            "du.cvs.principal@gmail.com",
            "daulatramcollegedu@gmail.com",
            "principal@dsc.du.ac.in",
            "dyalsingheveningcollege@yahoo.in",
            "dducollegeoffice@gmail.com",
            "principaldcac@gmail.com",
            "dbcollege.du@gmail.com",
            "brambedkarcollege.du@gmail.com",
            "gargicollege7@gmail.com",
            "principal@hansrajcollege.ac.in",
            "principal@hinducollege.org",
            "principal@igipess.du.ac.in",
            "ipcw@ip.du.ac.in",
            "principal@ihe.du.ac.in",
            "jdmcollege@hotmail.com",
            "info@jmc.ac.in",
            "kalindisampark.du@gmail.com",
            "kamla.nehru_du@hotmail.com",
            "principal@keshav.du.ac.in",
            "info@kmcollege.ac.in",
            "director@lic.du.ac.in",
            "lsrc@lsr.edu.in",
            "info@lb.du.ac.in",
            "principal@mac.du.ac.in",
            "mvce1995@gmail.com",
            "info@maitreyi.du.ac.in",
            "matasundricollege.du@gmail.com",
            "principal@mirandahouse.ac.in",
            "motilalnehru64@gmail.com",
            "contact@mlnce.org",
            "pgdavcollege.edu@gmail.com",
            "principalpgdaveve@gmail.com",
            "info@rajdhani.du.ac.in",
            "rlac.du@gmail.com",
            "Not Available",
            "principalramjascollege@gmail.com",
            "Principal@satyawati.du.ac.in",
            "principal@satyawatie.du.ac.in",
            "sbscprincipal@gmail.com",
            "principal.sbsec@gmail.com",
            "principal@rajguru.du.ac.in",
            "admissionhelpdesk@sscbsdu.ac.in",
            "shivajicollege.ac@gmail.com",
            "ao.admin@srcc.du.ac.in",
            "slcm@shyamlal.du.ac.in",
            "Not available",
            "principal@aurobindo.du.ac.in",
            "sriaurobindoeven@yahoo.com",
            "principal@sggscc.du.ac.in",
            "principal@sgndkc.du.ac.in",
            "info@sgtbkhalsadu.ac.in",
            "adminofficer@svc.ac.in",
            "ssc@ststephans.edu",
            "exam@ss.du.ac.in",
            "vivac2008@vivekanand.du.ac.in",
            "zakirhusaindelhicollege@gmail.com",
            "principal@zhe.du.ac.in"




    };

    String coladdress[] = {
            "Acharya Narendra Dev College\n" +
                    "(University of Delhi)\n" +
                    "Govindpuri, Kalkaji,\n" +
                    "New Delhi 110019",

            //aditi
            "Delhi Auchandi Road, Bawana, Delhi-110039",

            //aryabhatta
            "Aryabhatta College, \n" +
                    "Benito Juarez Road, \n" +
                    "New Delhi-110021, India",

            //atmaram
            "Dhaula Kuan, New Delhi - 110021",

            //Bhagini
            "Kair, Near Najafgarh \n" +
                    "New Delhi - 110043 \n" +
                    "Delhi NCR , India",
            //Bhariti
            "C-4, Dada Satram Mamtani Marg, Janakpuri, \nNew Delhi, Delhi 110058",

            //bhaskaracharya
            "Bhaskaracharya College of Applied Science Sector 2, \nPhase 1, Dwarika New Delhi-110075, India",


            //delhicollegeofarts
            "B -7/7,Basement, Ring Road, Rajouri Garden,\n" +
                    "New Delhi - 110027",
            //college of voactional arts
            " College of Vocational Studies, Triveni, Sheikh Sarai-II, New Delhi 110017",
            //Daulat ram college
            "4, Patel Marg, Maurice Nagar\n" +
                    "\n" +
                    "Delhi 110007",
            //Dyal singh college
            "Lodi Road New Delhi 110003",
            //Dyal singh eve
            "Lodi Road New Delhi 110003",
            //Deen dyal upadhaya
            "Deen Dayal Upadhyaya College\n" +
                    "Sector-3, Dwarka\n" +
                    "New Delhi-110 078",
            //Delhi college of arts and commerce
            "Delhi College of Arts & Commerce\n" +
                    "Netaji Nagar \n" +
                    "New Delhi-110023\n" +
                    "India",

            //Deshbandhu college
            "Kalkaji Main Rd, Block H, Kalkaji,\n" +
                    "New Delhi, Delhi 110019",

            //Dr bhimrao ambedkar
            "Main Wazirabad Road Yamuna Vihar Delhi-110094",

            //Gargi college
            "Siri Fort Road\n" +
                    "New Delhi-110049",

            //Hansraj college
            "Mahatma Hansraj Marg\n" +
                    "\n" +
                    "Malkaganj, Delhi 110 007, India",

            //Hindu college
            "Sudhir Bose Marg, Hindu College\n, " +
                    "University Enclave, Delhi, 110007",

            //Indira gandhi institue of Physical eduaction
            "IGIPESS - B-Block,Vikaspuri\n" +
                    "\n" +
                    "New Delhi-110 018",

            //Indraprastha college of women
            "INDRAPRASTHA COLLEGE FOR WOMEN\n" +
                    "\n" +
                    "31, Sham Nath Marg, Delhi-110054",

            //Institue of home economics
            "F-4, Hauz Khas Enclave\n" +
                    "\n" +
                    "Near Hauz Khas Metro Station\n" +
                    "\n" +
                    "New Delhi-110016",

            //janki devi memorial college
            "Sir Ganga Ram Hospital Marg, New Delhi - 110060",

            //jesus and marry coolege
            ": Jesus and Mary College, \n" +
                    "                 Chanakyapuri, New Delhi- 110021",

            //kalindi college
            "East Patel Nagar, New Delhi-110008",

            //kamla nehru  college
            " August kranti Marg,\n" +
                    "        New Delhi- 110049",

            //keshav mahavidhayala
            " H-4-5 Zone, Pitampura,\n" +
                    "Near Sainik Vihar, Delhi-110034",

            //kirori mal college
            "KIRORI MAL COLLEGE,\n" +
                    "University Of Delhi,\n" +
                    "North Campus,\n" +
                    "Delhi-110007,\n" +
                    "India",

            //Lady irvin college
            "Sikandra Road\n" +
                    "New Delhi - 110001",

            //lady shriram
            "Lajpat Nagar-IV\n" +
                    "New Delhi – 110024",

            //lakshimbhai college
            "Ashok Vihar Phase III, Delhi-110052",

            //Maharaja agrasena college
            "Vasundhara Enclave, Delhi -110096",

            //Maharishi valmiki college of education
            "Geeta Colony, Delhi-110031",

            //Maitreyi college
            "Bapudham Complex\n" +
                    "Chanakyapuri\n" +
                    "New Delhi- 110021 ",

            //mata sundari college for women
            "Mata Sundri Lane, New Delhi, 110002",

            //Miranda house
            "GC Narang Road, University Enclave, New Delhi, Delhi 110007",

            //motilal nehru college
            " Benito Juarez Road, South Campus, New Delhi-110021",

            //motilal nehru college(eve)
            "Benito Juarez Road, South Campus, New Delhi-110021",

            //PGDAV
            "Ring Rd, Nehru Nagar, Lajpat Nagar, New Delhi, Delhi 110065",

            //PGDAV(eve)
            "Ring Rd, Nehru Nagar, Lajpat Nagar, New Delhi, Delhi 110065",

            //Rajdhani college
            "Mahatma Gandhi Marg, Block C, Raja Garden, New Delhi, Delhi 110015",

            //ram lal ananda college
            "Benito Juarez Road, New Delhi-110021",

            //Ramanujan college
            "CR Park Main Rd, Near Deshbandhu College, Block H, Kalkaji, New Delhi, Delhi 110019",

            //Ramjas college
            "Ramjas College, University Enclave, New Delhi, Delhi 110007",

            //satyawati college
            "Ashok Vihar, Phase-III, Delhi-110052",

            //satyawati eve
            "Ashok Vihar, Phase-III, Delhi-110052",


            //Shaheed bhagat singh college
            "Sheikh Sarai Phase II, New Delhi 110017",

            //Shaheed bhagat singh college(eve)
            "Sheikh Sarai Phase-II,\n" +
                    "New Delhi-110017(India)",

            //Shaheed rajguru college of applied sciences\
            "Vasundhara Enclave, Delhi-110096",

            //shaheed sukhdev college of bussiness studies
            "Dr. K.N. Katju Marg Rohini Sector 16, PSP Area IV, Rohini, New Delhi, Delhi 110089",

            //shivaji college
            "Ring Road, Raja Garden,New Delhi-110027",


            //shri ram college of commerce
            "University of Delhi North Campus, Maurice Nagar\n" +
                    "Delhi - 110 007, INDIA",

            //shyama lal college
            "G.T. Road, Shahdara\n" +
                    "Delhi-110032\n" +
                    "India",

            //shyama lal college(eve)
            "GT Road, Near Metro Sation, Dwarkapuri, Shahdara, New Delhi, Delhi 110032",

            //Shri Aurobindo college
            "Shivalik, Malviya Nagar, New Delhi-110017,Landmark :\tMalviya Nagar Metro Station",

            //Shri Aurobindo college(eve)
            "Shivalik, Malviya Nagar, New Delhi-110017,Landmark :\tMalviya Nagar Metro Station",

            //Shri guru gobind singh college of commerce
            "Opposite TV Tower, Pitam Pura, New Delhi, Delhi 110034",

            //shri guru nanak dev khalsa college
            "Guru Ravi Das Marg, Block 4, Dev Nagar, Karol Bagh, New Delhi, Delhi 110005",

            //shri guru teg bahadur khalsa college
            "University Of Delhi (North Campus), New Delhi",

            //Shri venkateshwara college
            "Sri Venkateswara College\n" +
                    "(University of Delhi)\n" +
                    "Benito Juarez Road\n" +
                    "Dhaula Kuan\n" +
                    "New Delhi - 110 021\n",
            //St stephan
            "Sudhir Bose Marg, University Enclave, New Delhi, Delhi 110007",

            //swami shraddhanada college
            "Alipur, Delhi - 110036",

            //vivekananda college
            "Vivek Vihar, Delhi, 110095",

            //zakhir hussain college
            " Jawaharlal Nehru Marg, SKD Basti, Press Enclave, Ajmeri Gate, New Delhi, Delhi 110002",

            //Zakhir hussain college eve
            "JAWAHARLAL NEHRU MARG\n" +
                    "NEW DELHI - 110 002"

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collegelist);


        final ListView listView = findViewById(R.id.lv);
        final customadapter cs = new customadapter();
        listView.setAdapter(cs);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                positionsetter(position);
            }
        });


    }


    class customadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return collnames.length;
        }


        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.listviewcollege, null);
            TextView t1 = convertView.findViewById(R.id.colname);
            TextView t2 = convertView.findViewById(R.id.coldesc);
            t1.setText(collnames[position]);
            t2.setText(colldesc[position]);
            return convertView;

        }


    }


    public void positionsetter(int position) {
        tempcname = collnames[position];
        tempcrname = colldesc[position];
        tempcolmapname = colmap[position];
        tempcolimage = cImages[position];
        tempcollink = collink[position];
        tempcoursedetailed = colcoursedetailed[position];
        tempbroname = broch[position];
        tempcolintro = colintro[position];
       // tempcourseintro = courseintro[position];
        tempphone = colphone[position];
        tempemail = colemail[position];
        tempaddress = coladdress[position];


        i = new Intent(collegelist.this, collegeinfonew.class);
        i.putExtra("collegenametopass", tempcname);
        i.putExtra("coursesnametopass", tempcrname);
        i.putExtra("colmapnametopass", tempcolmapname);
        i.putExtra("colimagetopass", tempcolimage);
        i.putExtra("coursedetailtopass", tempcoursedetailed);
        i.putExtra("collinktopass", tempcollink);
        i.putExtra("borlinktopass", tempbroname);
        i.putExtra("collegedetailtopass", tempcolintro);
       // i.putExtra("courseintrotopass",tempcourseintro);
        i.putExtra("phonetopass",tempphone);
        i.putExtra("emailtopass",tempemail);
        i.putExtra("addresstopass",tempaddress);


        startActivity(i);
        //  Toast.makeText(collegelist.this, tempcname, Toast.LENGTH_SHORT).show();
    }


}
