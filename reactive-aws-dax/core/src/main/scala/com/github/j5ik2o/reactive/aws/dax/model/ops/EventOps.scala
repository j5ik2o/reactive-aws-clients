// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class EventBuilderOps(val self: Event.Builder) extends AnyVal {

  final def sourceNameAsScala(value: Option[String]): Event.Builder = {
    value.fold(self) { v =>
      self.sourceName(v)
    }
  } // String

  final def sourceTypeAsScala(value: Option[SourceType]): Event.Builder = {
    value.fold(self) { v =>
      self.sourceType(v)
    }
  } // String

  final def messageAsScala(value: Option[String]): Event.Builder = {
    value.fold(self) { v =>
      self.message(v)
    }
  } // String

  final def dateAsScala(value: Option[java.time.Instant]): Event.Builder = {
    value.fold(self) { v =>
      self.date(v)
    }
  } // Instant

}

final class EventOps(val self: Event) extends AnyVal {

  final def sourceNameAsScala: Option[String] = Option(self.sourceName) // String

  final def sourceTypeAsScala: Option[SourceType] = Option(self.sourceType) // String

  final def messageAsScala: Option[String] = Option(self.message) // String

  final def dateAsScala: Option[java.time.Instant] = Option(self.date) // Instant

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEventOps {

  implicit def toEventBuilderOps(v: Event.Builder): EventBuilderOps = new EventBuilderOps(v)

  implicit def toEventOps(v: Event): EventOps = new EventOps(v)

}
