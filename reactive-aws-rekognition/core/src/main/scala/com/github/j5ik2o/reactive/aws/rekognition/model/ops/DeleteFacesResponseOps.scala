// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class DeleteFacesResponseBuilderOps(val self: DeleteFacesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletedFacesAsScala(value: Option[Seq[String]]): DeleteFacesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.deletedFaces(v.asJava)
    }
  }

}

final class DeleteFacesResponseOps(val self: DeleteFacesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def deletedFacesAsScala: Option[Seq[String]] = Option(self.deletedFaces).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteFacesResponseOps {

  implicit def toDeleteFacesResponseBuilderOps(v: DeleteFacesResponse.Builder): DeleteFacesResponseBuilderOps =
    new DeleteFacesResponseBuilderOps(v)

  implicit def toDeleteFacesResponseOps(v: DeleteFacesResponse): DeleteFacesResponseOps = new DeleteFacesResponseOps(v)

}
