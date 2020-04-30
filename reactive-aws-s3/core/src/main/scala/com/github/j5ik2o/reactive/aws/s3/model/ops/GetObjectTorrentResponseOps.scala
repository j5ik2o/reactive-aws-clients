// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetObjectTorrentResponseBuilderOps(val self: GetObjectTorrentResponse.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala(value: Option[RequestCharged]): GetObjectTorrentResponse.Builder = {
            value.fold(self){ v => self.requestCharged(v) }
            } 


}

final class GetObjectTorrentResponseOps(val self: GetObjectTorrentResponse) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetObjectTorrentResponseOps {

implicit def toGetObjectTorrentResponseBuilderOps(v: GetObjectTorrentResponse.Builder): GetObjectTorrentResponseBuilderOps = new GetObjectTorrentResponseBuilderOps(v)

implicit def toGetObjectTorrentResponseOps(v: GetObjectTorrentResponse): GetObjectTorrentResponseOps = new GetObjectTorrentResponseOps(v)

}

