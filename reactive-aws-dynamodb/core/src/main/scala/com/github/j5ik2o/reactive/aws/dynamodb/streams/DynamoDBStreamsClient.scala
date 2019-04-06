// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.streams

import software.amazon.awssdk.services.dynamodb.model._

trait DynamoDBStreamsClient[M[_]] {

  def describeStream(describeStreamRequest: DescribeStreamRequest): M[DescribeStreamResponse]

  def getRecords(getRecordsRequest: GetRecordsRequest): M[GetRecordsResponse]

  def getShardIterator(getShardIteratorRequest: GetShardIteratorRequest): M[GetShardIteratorResponse]

  def listStreams(listStreamsRequest: ListStreamsRequest): M[ListStreamsResponse]

  def listStreams(): M[ListStreamsResponse]

}
