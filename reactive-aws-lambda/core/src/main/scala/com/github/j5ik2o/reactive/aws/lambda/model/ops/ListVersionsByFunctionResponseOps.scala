// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class ListVersionsByFunctionResponseBuilderOps(val self: ListVersionsByFunctionResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala(value: Option[String]): ListVersionsByFunctionResponse.Builder = {
    value.fold(self) { v =>
      self.nextMarker(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionsAsScala(value: Option[Seq[FunctionConfiguration]]): ListVersionsByFunctionResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.versions(v.asJava)
    }
  }

}

final class ListVersionsByFunctionResponseOps(val self: ListVersionsByFunctionResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextMarkerAsScala: Option[String] = Option(self.nextMarker)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def versionsAsScala: Option[Seq[FunctionConfiguration]] = Option(self.versions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListVersionsByFunctionResponseOps {

  implicit def toListVersionsByFunctionResponseBuilderOps(
      v: ListVersionsByFunctionResponse.Builder
  ): ListVersionsByFunctionResponseBuilderOps = new ListVersionsByFunctionResponseBuilderOps(v)

  implicit def toListVersionsByFunctionResponseOps(
      v: ListVersionsByFunctionResponse
  ): ListVersionsByFunctionResponseOps = new ListVersionsByFunctionResponseOps(v)

}
