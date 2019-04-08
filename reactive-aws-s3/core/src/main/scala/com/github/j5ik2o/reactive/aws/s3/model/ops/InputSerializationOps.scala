// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class InputSerializationBuilderOps(val self: InputSerialization.Builder) extends AnyVal {

  final def csvAsScala(value: Option[CSVInput]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.csv(v)
    }
  }

  final def compressionTypeAsScala(value: Option[CompressionType]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.compressionType(v)
    }
  }

  final def jsonAsScala(value: Option[JSONInput]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.json(v)
    }
  }

  final def parquetAsScala(value: Option[ParquetInput]): InputSerialization.Builder = {
    value.fold(self) { v =>
      self.parquet(v)
    }
  }

}

final class InputSerializationOps(val self: InputSerialization) extends AnyVal {

  final def csvAsScala: Option[CSVInput] = Option(self.csv)

  final def compressionTypeAsScala: Option[CompressionType] = Option(self.compressionType)

  final def jsonAsScala: Option[JSONInput] = Option(self.json)

  final def parquetAsScala: Option[ParquetInput] = Option(self.parquet)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInputSerializationOps {

  implicit def toInputSerializationBuilderOps(v: InputSerialization.Builder): InputSerializationBuilderOps =
    new InputSerializationBuilderOps(v)

  implicit def toInputSerializationOps(v: InputSerialization): InputSerializationOps = new InputSerializationOps(v)

}
