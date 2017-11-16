package contracts.buddy

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            request {
                method 'HEAD'
                url '/buddies/Simu'
            }

            response {
                status 204
            }
        },
        Contract.make {
            request {
                method 'HEAD'
                url '/buddies/Dima'
            }

            response {
                status 204
            }
        },
        Contract.make {
            request {
                method 'HEAD'
                url '/buddies/Tru'
            }

            response {
                status 404
            }
        }
]