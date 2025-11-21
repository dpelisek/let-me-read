package dp.let_me_read;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LetMeReadApplication {

    // TODO: rest end point to download/stream audio (e.g. websocket)
    // TODO: Handles buffering, pause/resume, and error recovery.
    // TODO: rest end point to upload audio
    // TODO: db repostiroy and service to search, audio
    // TODO: service to save and read audio (to s3 bucket)
    // TODO: service to create an audio from text
    // TODO: rest end point to upload/send a text and create an audio file(s) out of it
    // TODO: caching
    // TODO: multi-tenancy - like a family/or group that can access their "private" records
    // TODO: dockerize and clusterize, load balancer, ingress, help chart

	public static void main(String[] args) {
		SpringApplication.run(LetMeReadApplication.class, args);
	}

}
