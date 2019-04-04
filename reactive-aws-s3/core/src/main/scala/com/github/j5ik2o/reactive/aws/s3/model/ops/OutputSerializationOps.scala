// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class OutputSerializationBuilderOps(val self: OutputSerialization.Builder) extends AnyVal {

  final def withCsvAsScala(value: Option[CSVOutput]): OutputSerialization.Builder = {
    value.fold(self) { v =>
      self.csv(v)
    }
  } // CSVOutput

  final def withJsonAsScala(value: Option[JSONOutput]): OutputSerialization.Builder = {
    value.fold(self) { v =>
      self.json(v)
    }
  } // JSONOutput

}

final class OutputSerializationOps(val self: OutputSerialization) extends AnyVal {

  final def csvAsScala: Option[CSVOutput] = Option(self.csv) // CSVOutput

  final def jsonAsScala: Option[JSONOutput] = Option(self.json) // JSONOutput

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToOutputSerializationOps {

  implicit def toOutputSerializationBuilderOps(v: OutputSerialization.Builder): OutputSerializationBuilderOps =
    new OutputSerializationBuilderOps(v)

  implicit def toOutputSerializationOps(v: OutputSerialization): OutputSerializationOps = new OutputSerializationOps(v)

}
