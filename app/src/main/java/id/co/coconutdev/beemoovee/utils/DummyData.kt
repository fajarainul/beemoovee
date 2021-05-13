package id.co.coconutdev.beemoovee.utils

import id.co.coconutdev.beemoovee.data.Movie
import id.co.coconutdev.beemoovee.data.TvShow

object DummyData {

    fun generateDummyMovies(): List<Movie> {


        val movies = ArrayList<Movie>()

        movies.add(Movie("1", "Avengers: Infinity War", "April 27, 2018", 8.0, "@drawable/poster_avengerinfinity", "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain."))
        movies.add(Movie("2", "Mary Poppins Returns", "December 19 , 2018",8.2, "@drawable/poster_marrypopins", "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael\'s three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives."))
        movies.add(Movie("3", "Creed II", "November 21, 2018", 8.1, "@drawable/poster_creed", "Between personal obligations and training for his next big fight against an opponent with ties to his family\'s past, Adonis Creed is up against the challenge of his life."))
        movies.add(Movie("4", "Robin Hood", "November 21, 2018",8.3, "@drawable/poster_robinhood", "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown."))
        movies.add(Movie("5", "Venom", "October 5, 2018",8.4, "@drawable/poster_venom", "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."))
        movies.add(Movie("6", "Spider-Man: Into the Spider-Verse", "December 14, 2018",8.5, "@drawable/poster_spiderman", "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension."))
        movies.add(Movie("7", "Bumblebee", "December 21, 2018", 8.6, "@drawable/poster_bumblebee", "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken.  When Charlie revives him, she quickly learns this is no ordinary yellow VW bug."))
        movies.add(Movie("8", "Aquaman", "December 21, 2018", 8.7, "@drawable/poster_aquaman", "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm\'s half-human, half-Atlantean brother and true heir to the throne."))
        movies.add(Movie("9", "Bohemian Rhapsody", "November 2, 2018", 8.8, "@drawable/poster_bohemian", "Singer Freddie Mercury, guitarist Brian May, drummer Roger Taylor and bass guitarist John Deacon take the music world by storm when they form the rock \'n\' roll band Queen in 1970. Hit songs become instant classics. When Mercury\'s increasingly wild lifestyle starts to spiral out of control, Queen soon faces its greatest challenge yet – finding a way to keep the band together amid the success and excess."))
        movies.add(Movie("10", "A Star Is Born", "October 5, 2018", 8.9, "@drawable/poster_a_star", "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally\'s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons."))

        return movies
    }

    fun generateDummyTVShows(): List<TvShow> {

        val shows = ArrayList<TvShow>()

        shows.add(TvShow("1", "Arrow", "October 10, 2012", 8.0, "@drawable/poster_arrow", "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow."))
        shows.add(TvShow("2", "Doom Patrol", "February 15, 2019", 8.0, "@drawable/poster_doom_patrol", "The Doom Patrol\'s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find."))
        shows.add(TvShow("3", "Dragon Ball", "February 26, 1986", 8.0, "@drawable/poster_dragon_ball", "Long ago in the mountains, a fighting master known as Gohan discovered a strange boy whom he named Goku. Gohan raised him and trained Goku in martial arts until he died. The young and very strong boy was on his own, but easily managed. Then one day, Goku met a teenage girl named Bulma, whose search for the dragon balls brought her to Goku\'s home. Together, they set off to find all seven dragon balls in an adventure."))
        shows.add(TvShow("4", "Fairy Tail", "October 12, 2009", 8.0, "@drawable/poster_fairytail", "Lucy is a 17-year-old girl, who wants to be a full-fledged mage. One day when visiting Harujion Town, she meets Natsu, a young man who gets sick easily by any type of transportation. But Natsu isn\'t just any ordinary kid, he\'s a member of one of the world\'s most infamous mage guilds: Fairy Tail."))
        shows.add(TvShow("5", "Family Guy", "January 31, 1999", 8.0, "@drawable/poster_family_guy", "Sick, twisted, politically incorrect and Freakin\' Sweet animated series featuring the adventures of the dysfunctional Griffin family. Bumbling Peter and long-suffering Lois have three kids. Stewie (a brilliant but sadistic baby bent on killing his mother and taking over the world), Meg (the oldest, and is the most unpopular girl in town) and Chris (the middle kid, he\'s not very bright but has a passion for movies). The final member of the family is Brian - a talking dog and much more than a pet, he keeps Stewie in check whilst sipping Martinis and sorting through his own life issues."))
        shows.add(TvShow("6", "The Flash", "October 7, 2014", 8.0, "@drawable/poster_flash", "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only \"meta-human\" who was created in the wake of the accelerator explosion — and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won\'t be long before the world learns what Barry Allen has become…The Flash."))
        shows.add(TvShow("7", "Game of Thrones", "April 17, 2011", 8.0, "@drawable/poster_god", "Seven noble families fight for control of the mythical land of Westeros. Friction between the houses leads to full-scale war. All while a very ancient evil awakens in the farthest north. Amidst the war, a neglected military order of misfits, the Night\'s Watch, is all that stands between the realms of men and icy horrors beyond."))
        shows.add(TvShow("8", "Gotham", "September 22, 2014", 8.0, "@drawable/poster_gotham", "Everyone knows the name Commissioner Gordon. He is one of the crime world\'s greatest foes, a man whose reputation is synonymous with law and order. But what is known of Gordon\'s story and his rise from rookie detective to Police Commissioner? What did it take to navigate the multiple layers of corruption that secretly ruled Gotham City, the spawning ground of the world\'s most iconic villains? And what circumstances created them – the larger-than-life personas who would become Catwoman, The Penguin, The Riddler, Two-Face and The Joker?"))
        shows.add(TvShow("9", "Gray Anatomy", "March 27, 2005", 8.0, "@drawable/poster_grey_anatomy", "Follows the personal and professional lives of a group of doctors at Seattle\'s Grey Sloan Memorial Hospital."))
        shows.add(TvShow("10", "Hanna", "March 28, 2019", 8.0, "@drawable/poster_hanna", "This thriller and coming-of-age drama follows the journey of an extraordinary young girl as she evades the relentless pursuit of an off-book CIA agent and tries to unearth the truth behind who she is. Based on the 2011 Joe Wright film."))

        return shows
    }
}