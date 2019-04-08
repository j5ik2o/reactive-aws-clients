// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListStreamsResponseBuilderOps(val self: ListStreamsResponse.Builder) extends AnyVal {

  final def streamsAsScala(value: Option[Seq[Stream]]): ListStreamsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.streams(v.asJava)
    } // Seq[Stream]
  }

  final def lastEvaluatedStreamArnAsScala(value: Option[String]): ListStreamsResponse.Builder = {
    value.fold(self) { v =>
      self.lastEvaluatedStreamArn(v)
    }
  } // String

}

final class ListStreamsResponseOps(val self: ListStreamsResponse) extends AnyVal {

  final def streamsAsScala: Option[Seq[Stream]] = Option(self.streams).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Stream]

  final def lastEvaluatedStreamArnAsScala: Option[String] = Option(self.lastEvaluatedStreamArn) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamsResponseOps {

  implicit def toListStreamsResponseBuilderOps(v: ListStreamsResponse.Builder): ListStreamsResponseBuilderOps =
    new ListStreamsResponseBuilderOps(v)

  implicit def toListStreamsResponseOps(v: ListStreamsResponse): ListStreamsResponseOps = new ListStreamsResponseOps(v)

}
