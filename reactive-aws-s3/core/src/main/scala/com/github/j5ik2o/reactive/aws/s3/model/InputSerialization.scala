package com.github.j5ik2o.reactive.aws.s3.model

final case class InputSerialization(
    csv: Option[CSVInput] = None,
    compressionType: Option[CompressionType] = None,
    json: Option[JSONInput] = None,
    parquet: Option[ParquetInput] = None
) {
  def withCsv(value: Option[CSVInput]): InputSerialization =
    copy(csv = value)
  def withCompressionType(value: Option[CompressionType]): InputSerialization =
    copy(compressionType = value)
  def withJson(value: Option[JSONInput]): InputSerialization =
    copy(json = value)
  def withParquet(value: Option[ParquetInput]): InputSerialization =
    copy(parquet = value)
}
