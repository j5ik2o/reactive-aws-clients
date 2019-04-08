// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListStreamsResponseBuilderOps(val self: ListStreamsResponse.Builder) extends AnyVal {

  final def streamNamesAsScala(value: Option[Seq[String]]): ListStreamsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.streamNames(v.asJava)
    }
  }

  final def hasMoreStreamsAsScala(value: Option[Boolean]): ListStreamsResponse.Builder = {
    value.fold(self) { v =>
      self.hasMoreStreams(v)
    }
  }

}

final class ListStreamsResponseOps(val self: ListStreamsResponse) extends AnyVal {

  final def streamNamesAsScala: Option[Seq[String]] = Option(self.streamNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def hasMoreStreamsAsScala: Option[Boolean] = Option(self.hasMoreStreams)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamsResponseOps {

  implicit def toListStreamsResponseBuilderOps(v: ListStreamsResponse.Builder): ListStreamsResponseBuilderOps =
    new ListStreamsResponseBuilderOps(v)

  implicit def toListStreamsResponseOps(v: ListStreamsResponse): ListStreamsResponseOps = new ListStreamsResponseOps(v)

}
