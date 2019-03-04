package com.github.j5ik2o.reactive.dynamodb.model.rs

import com.github.j5ik2o.reactive.dynamodb.model.{
  BatchGetItemResponse,
  ListTablesResponse,
  QueryResponse,
  ScanResponse
}
import org.reactivestreams.Publisher

trait BatchGetItemPublisher extends Publisher[BatchGetItemResponse]

trait ListTablesPublisher extends Publisher[ListTablesResponse]

trait QueryPublisher extends Publisher[QueryResponse]

trait ScanPublisher extends Publisher[ScanResponse]
