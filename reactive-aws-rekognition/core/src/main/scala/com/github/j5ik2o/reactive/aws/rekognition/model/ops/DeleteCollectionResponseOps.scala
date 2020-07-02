// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteCollectionResponseBuilderOps(val self: DeleteCollectionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala(value: Option[Int]): DeleteCollectionResponse.Builder = {
    value.fold(self) { v => self.statusCode(v) }
  }

}

final class DeleteCollectionResponseOps(val self: DeleteCollectionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusCodeAsScala: Option[Int] = Option(self.statusCode)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteCollectionResponseOps {

  implicit def toDeleteCollectionResponseBuilderOps(
      v: DeleteCollectionResponse.Builder
  ): DeleteCollectionResponseBuilderOps = new DeleteCollectionResponseBuilderOps(v)

  implicit def toDeleteCollectionResponseOps(v: DeleteCollectionResponse): DeleteCollectionResponseOps =
    new DeleteCollectionResponseOps(v)

}
