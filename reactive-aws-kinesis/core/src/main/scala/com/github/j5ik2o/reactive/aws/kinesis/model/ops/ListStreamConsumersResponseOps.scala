// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ListStreamConsumersResponseBuilderOps(val self: ListStreamConsumersResponse.Builder) extends AnyVal {

  final def withConsumersAsScala(value: Option[Seq[Consumer]]): ListStreamConsumersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.consumers(v.asJava)
    } // Seq[Consumer]
  }

  final def withNextTokenAsScala(value: Option[String]): ListStreamConsumersResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  } // String

}

final class ListStreamConsumersResponseOps(val self: ListStreamConsumersResponse) extends AnyVal {

  final def consumersAsScala: Option[Seq[Consumer]] = Option(self.consumers).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Consumer]

  final def nextTokenAsScala: Option[String] = Option(self.nextToken) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListStreamConsumersResponseOps {

  implicit def toListStreamConsumersResponseBuilderOps(
      v: ListStreamConsumersResponse.Builder
  ): ListStreamConsumersResponseBuilderOps = new ListStreamConsumersResponseBuilderOps(v)

  implicit def toListStreamConsumersResponseOps(v: ListStreamConsumersResponse): ListStreamConsumersResponseOps =
    new ListStreamConsumersResponseOps(v)

}
