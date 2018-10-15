import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Home6 {

	public static void main(String[] args) throws IOException {
		HttpStatusCode numb = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What is your Error?");

		Integer errors = Integer.parseInt(br.readLine());
		switch (errors) {
		case 100:
			numb = HttpStatusCode.CONTINUE;
			break;
		case 101:
			numb = HttpStatusCode.SWITCHING_PROTOCOL;
			break;
		case 102:
			numb = HttpStatusCode.PROCESSING;
			break;
		case 200:
			numb = HttpStatusCode.OK;
		case 201:
			numb = HttpStatusCode.CREATED;
			break;
		case 202:
			numb = HttpStatusCode.ACCEPTED;
			break;
		case 203:
			numb = HttpStatusCode.NON_AUTHORITATIVE_INFORMATION;
			break;
		case 204:
			numb = HttpStatusCode.NO_CONTENT;
			break;
		case 205:
			numb = HttpStatusCode.RESET_CONTENT;
			break;
		case 206:
			numb = HttpStatusCode.PARTIAL_CONTENT;
			break;
		case 207:
			numb = HttpStatusCode.PARTIAL_CONTENT;
			break;
		case 208:
			numb = HttpStatusCode.ALREADY_REPORTED;
			break;
		case 226:
			numb = HttpStatusCode.IM_USED;
			break;
		case 300:
			numb = HttpStatusCode.MULTIPLE_CHOICES;
			break;
		case 301:
			numb = HttpStatusCode.MOVED_PERMANENTLY;
			break;
		case 302:
			numb = HttpStatusCode.FOUND;
			break;
		case 303:
			numb = HttpStatusCode.SEE_OTHER;
			break;
		case 304:
			numb = HttpStatusCode.NOT_MODIFIED;
			break;
		case 305:
			numb = HttpStatusCode.USE_PROXY;
			break;
		case 306:
			numb = HttpStatusCode.SWITCH_PROXY;
			break;
		case 307:
			numb = HttpStatusCode.TEMPORARY_REDIRECT;
			break;
		case 308:
			numb = HttpStatusCode.PERMANENT_REDIRECT;
			break;
		case 400:
			numb = HttpStatusCode.BAD_REQUEST;
			break;
		case 401:
			numb = HttpStatusCode.UNAUTHORIZED;
			break;
		case 402:
			numb = HttpStatusCode.PAYMENT_REQUIRED;
			break;
		case 403:
			numb = HttpStatusCode.FORBIDDEN;
			break;
		case 404:
			numb = HttpStatusCode.NOT_FOUND;
			break;
		case 405:
			numb = HttpStatusCode.METHOD_NOT_ALLOWED;
			break;
		case 406:
			numb = HttpStatusCode.NOT_ACCEPTABLE;
			break;
		case 407:
			numb = HttpStatusCode.PROXY_AUTHENTICATION_REQUIRED;
			break;
		case 408:
			numb = HttpStatusCode.REQUEST_TIMEOUT;
			break;
		case 409:
			numb = HttpStatusCode.CONFLICT;
			break;
		case 410:
			numb = HttpStatusCode.GONE;
			break;
		case 411:
			numb = HttpStatusCode.LENGTH_REQUIRED;
			break;
		case 412:
			numb = HttpStatusCode.PRECONDITION_FAILED;
			break;
		case 413:
			numb = HttpStatusCode.REQUEST_ENTITY_TOO_LARGE;
			break;
		case 414:
			numb = HttpStatusCode.REQUEST_URI_TOO_LONG;
			break;
		case 415:
			numb = HttpStatusCode.UNSUPPORTED_MEDIA_TYPE;
			break;
		case 416:
			numb = HttpStatusCode.REQUESTED_RANGE_NOT_SATISFIABLE;
			break;
		case 417:
			numb = HttpStatusCode.EXPECTATION_FAILED;
			break;
		case 500:
			numb = HttpStatusCode.INTERNAL_SERVER_ERROR;
			break;
		case 501:
			numb = HttpStatusCode.NOT_IMPLEMENTED;
			break;
		case 502:
			numb = HttpStatusCode.BAD_GATEWAY;
			break;
		case 503:
			numb = HttpStatusCode.SERVICE_UNAVAILABLE;
			break;
		case 504:
			numb = HttpStatusCode.GATEWAY_TIMEOUT;
			break;
		case 505:
			numb = HttpStatusCode.HTTP_VERSION_NOT_SUPPORTED;
			break;
		case 506:
			numb = HttpStatusCode.VARIANT_ALSO_NEGOTIATES;
			break;
		case 507:
			numb = HttpStatusCode.INSUFFICIENT_STORAGE;
			break;
		case 508:
			numb = HttpStatusCode.LOOP_DETECTED;
			break;
		case 509:
			numb = HttpStatusCode.BANDWIDTH_LIMIT_EXCEEDED;
			break;
		case 510:
			numb = HttpStatusCode.NOT_EXTEND;
			break;
		case 511:
			numb = HttpStatusCode.NETWORK_AUTHENTICATION_REQUIRED;
			break;
		case 522:
			numb = HttpStatusCode.CONNECTION_TIMED_OUT;
			break;
		case 523:
			numb = HttpStatusCode.PROXY_DECLINED_REQUEST;
			break;
		case 524:
			numb = HttpStatusCode.TIMEOUT_OCCURRED;
			break;
		}
		System.out.println("Description: " + numb);
	}

}
