// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class ListStreamProcessorsResponseBuilderOps(val self: ListStreamProcessorsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListStreamProcessorsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamProcessorsAsScala(value: Option[Seq[StreamProcessor]]): ListStreamProcessorsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.streamProcessors(v.asJava)
    }
  }

}

final class ListStreamProcessorsResponseOps(val self: ListStreamProcessorsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamProcessorsAsScala: Option[Seq[StreamProcessor]] =
    Option(self.streamProcessors).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamProcessorsResponseOps {

  implicit def toListStreamProcessorsResponseBuilderOps(
      v: ListStreamProcessorsResponse.Builder
  ): ListStreamProcessorsResponseBuilderOps = new ListStreamProcessorsResponseBuilderOps(v)

  implicit def toListStreamProcessorsResponseOps(v: ListStreamProcessorsResponse): ListStreamProcessorsResponseOps =
    new ListStreamProcessorsResponseOps(v)

}
